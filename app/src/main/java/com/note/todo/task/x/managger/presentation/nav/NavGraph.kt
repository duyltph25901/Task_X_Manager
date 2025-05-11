package com.note.todo.task.x.managger.presentation.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.note.todo.task.x.managger.commons.AppConst.PARAMS_IS_FROM_WELCOME_SCREEN
import com.note.todo.task.x.managger.presentation.login.LoginScreen
import com.note.todo.task.x.managger.presentation.onb.OnbScreen
import com.note.todo.task.x.managger.presentation.register.RegisterScreen
import com.note.todo.task.x.managger.presentation.splash.SplashScreen
import com.note.todo.task.x.managger.presentation.welcome.WelcomeScreen

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

        composable(
            route = Routes.WelcomeRoute.route
        ) {
            WelcomeScreen(
                navController = navController
            )
        }

        composable(
            route = Routes.LoginRoute.route
        ) {
            LoginScreen(
                navController = navController
            )
        }

        composable(
            route = Routes.RegisterRoute.route,
            arguments = listOf(
                navArgument(
                    name = PARAMS_IS_FROM_WELCOME_SCREEN,
                ) {
                    type = NavType.BoolType
                    defaultValue = true
                }
            )
        ) { backStackEntry ->
            val isFromWelcomeScreen =
                backStackEntry.arguments?.getBoolean(PARAMS_IS_FROM_WELCOME_SCREEN) ?: true
            RegisterScreen(
                navController = navController,
                isFromWelcomeScreen = isFromWelcomeScreen
            )
        }
    }
}