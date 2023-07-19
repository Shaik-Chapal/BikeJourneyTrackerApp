package com.project.bikejourneytrackerapp.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.project.bikejourneytrackerapp.ui.compose.DetailScreen
import com.project.bikejourneytrackerapp.ui.compose.PostsContainer
import com.project.bikejourneytrackerapp.viewmodel.RedditViewModel

@Composable
fun NavHostGraph(navController: NavHostController) {
    val viewModel = hiltViewModel<RedditViewModel>()

    NavHost(navController = navController, startDestination = Screens.HomeScreen.route) {
        composable(route = Screens.HomeScreen.route) {
            PostsContainer(navController = navController, viewModel)
        }
        composable(route = Screens.DetailScreen.route) {

            DetailScreen(navController = navController, it.arguments?.getString("postId") ?: "", viewModel)

        }
    }

}