package com.note.todo.task.x.managger.presentation.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.note.todo.task.x.managger.presentation.onb.OnbScreen
import com.note.todo.task.x.managger.presentation.splash.SplashScreen

@Composable
fun NavGraph() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.SplashRoute.route
    ) {
        composable(
            route = Routes.SplashRoute.route
        ) {
            SplashScreen(
                navController = navController
            )
        }

        composable(
            route = Routes.OnbRoute.route
        ) {
            OnbScreen(
                navController = navController
            )
        }
    }
}