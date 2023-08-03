package xyz.summer.bikejourneytracker.util.ui.composables.tabs

import android.content.Context
import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import xyz.summer.bikejourneytracker.presentation.screen.MapActivity
import xyz.summer.bikejourneytracker.presentation.screen.TopFiveActivity

/**
 * Composable function that represents the search screen of the application.
 */
@Composable
fun SearchScreen(
) {
    val context = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = { onTop5PopularReturnStationsClick(context) },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Top 5 most popular return stations")
        }

        Button(
            onClick = { onTop5PopularDepartureStationsClick(context) },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Top 5 most popular departure stations")
        }
    }
}

fun onTop5PopularDepartureStationsClick(context: Context) {
    val intent = Intent(context, TopFiveActivity::class.java)
    intent.putExtra("list", "1")
    context.startActivity(intent)
}

fun onTop5PopularReturnStationsClick(context: Context) {
    val intent = Intent(context, TopFiveActivity::class.java)
    intent.putExtra("list", "2")
    context.startActivity(intent)
}
