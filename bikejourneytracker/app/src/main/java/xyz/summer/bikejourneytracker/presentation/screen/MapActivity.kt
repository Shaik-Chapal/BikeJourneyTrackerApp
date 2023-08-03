package xyz.summer.bikejourneytracker.presentation.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import xyz.summer.bikejourneytracker.presentation.screen.ui.theme.BikeJourneyTrackerAppTheme

class MapActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BikeJourneyTrackerAppTheme {
                // A surface container using the 'background' color from the theme
                setContent {
                    LocalContext.current

                    // Assuming you have received the list of markers from the intent
                    val markerList = intent.getStringExtra("list")
                    if (markerList != null) {
                        GoogleMapMultipleMarker(markerList)
                    };
                }
                }
            }
        }
    }




