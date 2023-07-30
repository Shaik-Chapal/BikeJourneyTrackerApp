package xyz.summer.bikejourneytracker.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import xyz.summer.bikejourneytracker.util.ui.composables.MainScreen
import dagger.hilt.android.AndroidEntryPoint
import xyz.summer.bikejourneytracker.presentation.theme.BottomTabNavigationJetpackComposeTheme


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    /**
     * Called when the activity is starting. This is where most initialization should go:
     * calling `setContentView`, instantiating UI components, and binding data.
     *
     * @param savedInstanceState The previously saved instance state, if any.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomTabNavigationJetpackComposeTheme {
                val navController = rememberNavController()
                Surface(modifier = Modifier.fillMaxSize()) {
                    MainScreen(navController = navController)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    val navController = rememberNavController()
    BottomTabNavigationJetpackComposeTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            MainScreen(navController = navController)
        }
    }
}
//class MainActivity : ComponentActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContent {
//            PagingCachingTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    ListScreen()
//                }
//            }
//        }
//    }
//}