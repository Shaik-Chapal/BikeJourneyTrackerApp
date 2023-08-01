package xyz.summer.bikejourneytracker.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey
import xyz.summer.bikejourneytracker.presentation.component.CardBeer
import xyz.summer.bikejourneytracker.presentation.component.ProgressBarCenter
import xyz.summer.bikejourneytracker.presentation.viewmodel.BeerListViewModel

import androidx.navigation.NavController

@Composable
fun ListScreen(
    snackbar: SnackbarHostState = remember { SnackbarHostState() },
    viewmodel: BeerListViewModel = hiltViewModel(),
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
                    key = { beer -> beer.departureStationId }
                ),
                contentType = beers.itemContentType()
            ) { index ->
                val beer = beers[index]
                if (beer != null) CardBeer(beer = beer)
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


//@Composable
//fun CardBeer(beer: Beer, onClick: () -> Unit) {
//    // Implement your card UI here
//    // When the card is clicked, call the onClick lambda to navigate to the details screen
//    // You can display the beer details or any other UI elements inside the CardBeer composable
//    // and handle the click event appropriately.
//}
