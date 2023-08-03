package xyz.summer.bikejourneytracker.util.ui.composables

import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import xyz.summer.bikejourneytracker.presentation.screen.GoogleMapMultipleMarker
import xyz.summer.bikejourneytracker.presentation.screen.ListScreen
import xyz.summer.bikejourneytracker.presentation.viewmodel.SharedViewModel
import xyz.summer.bikejourneytracker.util.nav.NavItem
import xyz.summer.bikejourneytracker.util.ui.composables.tabs.HomeScreen
import xyz.summer.bikejourneytracker.util.ui.composables.tabs.SearchScreen

/**
 * Composable function that defines the navigation screens and their corresponding destinations.
 *
 * @param navController The navigation controller used for handling navigation between screens.
 */
@Composable
fun NavigationScreens(
    navController: NavHostController,
      vl: SharedViewModel = viewModel()

) {
    NavHost(navController, startDestination = NavItem.Home.path) {
        composable(NavItem.Home.path) { HomeScreen() }
        composable(NavItem.Search.path) { SearchScreen() }
        composable(NavItem.List.path) { ListScreen() }

//        composable(
//            route=NavItem.HOMEMAP.path+"/recipeId",
//            arguments = listOf(
//                navArgument("recipeId") { type = NavType.StringType },
//            )
//            ,
//
//            ) {  entry -> entry.arguments?.getString("recipeId")
//            ?.let { GoogleMapMultipleMarker(name = it) }
//        }



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

