package xyz.summer.bikejourneytracker.presentation.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import xyz.summer.bikejourneytracker.data.remote.journey.Return.ReturnResponseItem
import xyz.summer.bikejourneytracker.data.top_departure.DepartureResponseItem
import xyz.summer.bikejourneytracker.presentation.screen.ui.theme.BikeJourneyTrackerAppTheme
import xyz.summer.bikejourneytracker.presentation.viewmodel.DepartureViewModel
import xyz.summer.bikejourneytracker.presentation.viewmodel.ReturnViewModel
import xyz.summer.bikejourneytracker.util.ui.composables.tabs.HeaderS

@AndroidEntryPoint
class TopFiveActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BikeJourneyTrackerAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val markerList = intent.getStringExtra("list")

                    if (markerList == "1") {
                        // Pass the viewModel to the Departure composable
                        Departure()
                    } else {
                        Return()
                    }
                }
            }
        }
    }
}



@Composable
fun Departure(
    viewModel: DepartureViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    val departureData: List<DepartureResponseItem> by viewModel.departureData.collectAsState(emptyList())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),

        ) {
        HeaderS("Top Departure")
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(departureData) { departure ->
            DepartureItem(departure = departure)
        }
    }}
}

@Composable
fun DepartureItem(departure: DepartureResponseItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),

    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Station Name: ${departure.stationName}",
                style = TextStyle(fontSize = 16.sp)
            )
            Text(
                text = "Popularity: ${departure.popularity}",
                style = TextStyle(fontSize = 14.sp)
            )
            Text(
                text = "Station ID: ${departure.stationId}",
                style = TextStyle(fontSize = 14.sp)
            )
        }
    }
}



@Composable
fun Return(
    viewModel: ReturnViewModel = hiltViewModel(),
    modifier: Modifier = Modifier
) {
    val departureData: List<ReturnResponseItem> by viewModel.departureData.collectAsState(emptyList())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp),

        ) {
    HeaderS("Top Return")
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(departureData) { departure ->
            ReturnItem(departure = departure)
        }
    }}
}

@Composable
fun ReturnItem(departure: ReturnResponseItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),

        ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Station Name: ${departure.stationName}",
                style = TextStyle(fontSize = 16.sp)
            )
            Text(
                text = "Popularity: ${departure.popularity}",
                style = TextStyle(fontSize = 14.sp)
            )
            Text(
                text = "Station ID: ${departure.stationId}",
                style = TextStyle(fontSize = 14.sp)
            )
        }
    }
}

