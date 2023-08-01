package xyz.summer.bikejourneytracker.util.ui.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import xyz.summer.bikejourneytracker.presentation.screen.GoogleMapMultipleMarker
import xyz.summer.bikejourneytracker.presentation.screen.ListScreen
import xyz.summer.bikejourneytracker.util.nav.NavItem
import xyz.summer.bikejourneytracker.util.ui.composables.tabs.HomeScreen
import xyz.summer.bikejourneytracker.util.ui.composables.tabs.SearchScreen

/**
 * Composable function that defines the navigation screens and their corresponding destinations.
 *
 * @param navController The navigation controller used for handling navigation between screens.
 */
@Composable
fun NavigationScreens(navController: NavHostController) {
    NavHost(navController, startDestination = NavItem.Home.path) {
        composable(NavItem.Home.path) { HomeScreen(navController = navController) }
        composable(NavItem.Search.path) { SearchScreen() }
        composable(NavItem.List.path) { ListScreen() }
        composable(NavItem.HOMEMAP.path) { GoogleMapMultipleMarker() }

    }
}


