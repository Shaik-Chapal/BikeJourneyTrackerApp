package xyz.summer.bikejourneytracker.util.ui.composables.tabs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey
import com.dawinder.btnjc.ui.theme.typography
import xyz.summer.bikejourneytracker.R
import xyz.summer.bikejourneytracker.presentation.component.CardBeer
import xyz.summer.bikejourneytracker.presentation.component.CardStation
import xyz.summer.bikejourneytracker.presentation.component.ProgressBarCenter
import xyz.summer.bikejourneytracker.presentation.theme.md_theme_light_error
import xyz.summer.bikejourneytracker.presentation.viewmodel.BeerListViewModel
import xyz.summer.bikejourneytracker.presentation.viewmodel.StationListViewModel

/**
 * Composable function that represents the home screen of the application.
 */
@Composable
fun HomeScreen(snackbar: SnackbarHostState = remember { SnackbarHostState() },
               viewmodel: StationListViewModel = hiltViewModel(),
) {
    val beers = viewmodel.beers.collectAsLazyPagingItems()

    LaunchedEffect(key1 = beers.loadState) {
        val state = beers.loadState.refresh
        if (state is LoadState.Error) snackbar.showSnackbar(state.error.message ?: "")
    }

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbar) { data ->
                Snackbar(snackbarData = data)
            }
        }
    ) { padding ->
        LazyColumn(
            contentPadding = padding,
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            if (beers.loadState.prepend == LoadState.Loading) {
                item {
                    ProgressBarCenter()
                }
            }

            items(
                count = beers.itemCount,
                key = beers.itemKey(
                    key = { beer -> beer.fid }
                ),
                contentType = beers.itemContentType()
            ) { index ->
                val beer = beers[index]
                if (beer != null) CardStation(beer = beer)
            }

            when (val append = beers.loadState.append) {
                LoadState.Loading -> item {
                    ProgressBarCenter()
                }

                is LoadState.Error -> item {
                    LaunchedEffect(key1 = append) {
                        snackbar.showSnackbar(append.error.message ?: "")
                    }
                }

                else -> Unit
            }
        }
    }
}