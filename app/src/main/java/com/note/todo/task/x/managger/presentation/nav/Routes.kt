package com.note.todo.task.x.managger.presentation.nav

import com.note.todo.task.x.managger.commons.AppConst.PARAMS_IS_FROM_WELCOME_SCREEN
import com.note.todo.task.x.managger.commons.AppConst.ROUTE_LOGIN_SCREEN
import com.note.todo.task.x.managger.commons.AppConst.ROUTE_ONB_SCREEN
import com.note.todo.task.x.managger.commons.AppConst.ROUTE_REGISTER_SCREEN
import com.note.todo.task.x.managger.commons.AppConst.ROUTE_SPLASH_SCREEN
import com.note.todo.task.x.managger.commons.AppConst.ROUTE_WELCOME_SCREEN

sealed class Routes(val route: String) {
    data object SplashRoute: Routes(route = ROUTE_SPLASH_SCREEN)
    data object OnbRoute: Routes(route = ROUTE_ONB_SCREEN)
    data object WelcomeRoute: Routes(route = ROUTE_WELCOME_SCREEN)
    data object LoginRoute: Routes(route = ROUTE_LOGIN_SCREEN)
    data object RegisterRoute: Routes(route = ROUTE_REGISTER_SCREEN) {
        fun passDataFlag(isFromWelcomeScreen: Boolean) =
            this.route.replace(
                oldValue = "{$PARAMS_IS_FROM_WELCOME_SCREEN}",
                newValue = isFromWelcomeScreen.toString()
            )
    }
}