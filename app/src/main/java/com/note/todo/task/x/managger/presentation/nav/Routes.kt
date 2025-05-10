package com.note.todo.task.x.managger.presentation.nav

import com.note.todo.task.x.managger.commons.AppConst.ROUTE_ONB_SCREEN
import com.note.todo.task.x.managger.commons.AppConst.ROUTE_SPLASH_SCREEN

sealed class Routes(val route: String) {
    data object SplashRoute: Routes(route = ROUTE_SPLASH_SCREEN)
    data object OnbRoute: Routes(route = ROUTE_ONB_SCREEN)
}