package com.project.bikejourneytrackerapp.navigation

sealed class Screens(val route: String, val name: String) {
    object HomeScreen : Screens("home", "Home")
    object DetailScreen : Screens("detail/{postId}", "Detail")
}