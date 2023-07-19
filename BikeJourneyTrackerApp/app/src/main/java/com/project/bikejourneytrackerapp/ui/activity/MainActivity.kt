package com.project.bikejourneytrackerapp.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.project.bikejourneytrackerapp.navigation.NavHostGraph
import com.project.bikejourneytrackerapp.ui.theme.RedditViewerTheme
import com.project.bikejourneytrackerapp.viewmodel.RedditViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var viewModel: RedditViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()
            RedditViewerTheme {
                NavHostGraph(navController = navController)
            }
        }
    }
}