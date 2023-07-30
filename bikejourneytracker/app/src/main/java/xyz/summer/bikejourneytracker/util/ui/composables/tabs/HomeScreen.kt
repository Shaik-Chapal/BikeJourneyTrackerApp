package xyz.summer.bikejourneytracker.util.ui.composables.tabs

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.dawinder.btnjc.ui.theme.typography
import xyz.summer.bikejourneytracker.R
import xyz.summer.bikejourneytracker.presentation.theme.md_theme_light_error

/**
 * Composable function that represents the home screen of the application.
 */
@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = stringResource(id = R.string.home),
            style = typography.titleLarge,
            color = md_theme_light_error
        )
    }
}