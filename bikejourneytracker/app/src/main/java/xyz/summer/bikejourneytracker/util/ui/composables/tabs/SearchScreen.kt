package xyz.summer.bikejourneytracker.util.ui.composables.tabs

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.dawinder.btnjc.ui.theme.typography
import xyz.summer.bikejourneytracker.R
import xyz.summer.bikejourneytracker.presentation.theme.md_theme_dark_secondaryContainer

/**
 * Composable function that represents the search screen of the application.
 */
@Composable
fun SearchScreen(
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { onTop5PopularReturnStationsClick() },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Top 5 most popular return stations")
        }

        Button(
            onClick = { onTop5PopularDepartureStationsClick() },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Top 5 most popular departure stations")
        }
    }
}

fun onTop5PopularDepartureStationsClick() {
    TODO("Not yet implemented")
}

fun onTop5PopularReturnStationsClick() {
    TODO("Not yet implemented")
}
