package xyz.summer.bikejourneytracker.util.ui.composables

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import xyz.summer.bikejourneytracker.presentation.screen.BikeTrackerLoginScreen
import xyz.summer.bikejourneytracker.presentation.screen.ListScreen
import xyz.summer.bikejourneytracker.util.nav.NavItem
import xyz.summer.bikejourneytracker.util.ui.composables.tabs.HomeScreen
import xyz.summer.bikejourneytracker.util.ui.composables.tabs.SearchScreen

/**
 * Composable function that defines the navigation screens and their corresponding destinations.
 *
 * @param navController The navigation controller used for handling navigation between screens.
 */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun NavigationScreens(
    navController: NavHostController,

) {
    NavHost(navController, startDestination = NavItem.Home.path) {
        composable(NavItem.Home.path) { HomeScreen() }
        composable(NavItem.Search.path) { SearchScreen() }
        composable(NavItem.List.path) { ListScreen() }



    }
}
//fun NavGraphBuilder.GoogleMapMultipleMarker(
//
//) {
//    composable(
//        route=NavItem.HOMEMAP.path+"/recipeId",
//        arguments = listOf(
//            navArgument("recipeId") { type = NavType.StringType },
//        )
//        ,
//
//    ) {  entry -> entry.arguments?.getString("recipeId")
//        ?.let { GoogleMapMultipleMarker(name = it) }
//    }
//}

