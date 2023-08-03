package xyz.summer.bikejourneytracker.util.ui.composables.tabs

import android.content.Intent
import android.util.Log
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import androidx.paging.compose.itemContentType
import androidx.paging.compose.itemKey
import xyz.summer.bikejourneytracker.domain.model.StationModel
import xyz.summer.bikejourneytracker.presentation.component.CardStation
import xyz.summer.bikejourneytracker.presentation.component.ProgressBarCenter
import xyz.summer.bikejourneytracker.presentation.screen.GoogleMapMultipleMarker
import xyz.summer.bikejourneytracker.presentation.screen.MapActivity
import xyz.summer.bikejourneytracker.presentation.viewmodel.SharedViewModel
import xyz.summer.bikejourneytracker.presentation.viewmodel.StationListViewModel
import xyz.summer.bikejourneytracker.util.nav.NavPath

/**
 * Composable function that represents the home screen of the application.
 */
@Composable
fun HomeScreen(snackbar: SnackbarHostState = remember { SnackbarHostState() },
               viewmodel: StationListViewModel = hiltViewModel(),

) {
    val beers = viewmodel.beers.collectAsLazyPagingItems()
    val context = LocalContext.current

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
                if (beer != null) CardStation(beer = beer) {
                   // String() tt: (beer: StationModel) -> String = { beer -> "${beer.x},${beer.y}" }

//                    vl.setData(tt.toString())
//                    navController.navigate(NavPath.HOMEMAP.toString())
                    //context.startActivity(Intent(context, MapActivity::class.java))
                    val intent = Intent(context, MapActivity::class.java)
                    intent.putExtra("list", "${beer.x},${beer.y}")
                    context.startActivity(intent)
                    Log.d("dd","${beer.x},${beer.y}")




                }
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
//fun CardStation(station: Station, onClick: () -> Unit) {
//    // Implement your card UI here
//    // When the card is clicked, call the onClick lambda to navigate to the details screen
//    // You can display the station details or any other UI elements inside the CardStation composable
//    // and handle the click event appropriately.
//}

//fun HomeScreen(snackbar: SnackbarHostState = remember { SnackbarHostState() },
//               viewmodel: StationListViewModel = hiltViewModel(),
//) {
//    val beers = viewmodel.beers.collectAsLazyPagingItems()
//
//    LaunchedEffect(key1 = beers.loadState) {
//        val state = beers.loadState.refresh
//        if (state is LoadState.Error) snackbar.showSnackbar(state.error.message ?: "")
//    }
//
//    Scaffold(
//        snackbarHost = {
//            SnackbarHost(hostState = snackbar) { data ->
//                Snackbar(snackbarData = data)
//            }
//        }
//    ) { padding ->
//        LazyColumn(
//            contentPadding = padding,
//            verticalArrangement = Arrangement.spacedBy(10.dp),
//            modifier = Modifier.fillMaxSize()
//        ) {
//            if (beers.loadState.prepend == LoadState.Loading) {
//                item {
//                    ProgressBarCenter()
//                }
//            }
//
//            items(
//                count = beers.itemCount,
//                key = beers.itemKey(
//                    key = { beer -> beer.fid }
//                ),
//                contentType = beers.itemContentType()
//            ) { index ->
//                val beer = beers[index]
//                if (beer != null) CardStation(beer = beer)
//            }
//
//            when (val append = beers.loadState.append) {
//                LoadState.Loading -> item {
//                    ProgressBarCenter()
//                }
//
//                is LoadState.Error -> item {
//                    LaunchedEffect(key1 = append) {
//                        snackbar.showSnackbar(append.error.message ?: "")
//                    }
//                }
//
//                else -> Unit
//            }
//        }
//    }
//}

// GoogleMapMultipleMarker(
//                        station = station,
//                        onClick = {
//                            navController.navigate("details_screen")
//                        }
//                    )