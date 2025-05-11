package com.note.todo.task.x.managger.commons

object AppConst {
    internal const val PARAMS_IS_FROM_WELCOME_SCREEN = "isFromWelcomeScreen"

    internal const val ROUTE_SPLASH_SCREEN = "screen/route/splash"
    internal const val ROUTE_ONB_SCREEN = "screen/route/onb"
    internal const val ROUTE_WELCOME_SCREEN = "screen/route/welcome"
    internal const val ROUTE_LOGIN_SCREEN = "screen/route/login"
    internal const val ROUTE_REGISTER_SCREEN = "screen/route/register?$PARAMS_IS_FROM_WELCOME_SCREEN={$PARAMS_IS_FROM_WELCOME_SCREEN}"

    internal const val TAG_DEBUG = "TAG_DEBUG"

    internal const val KEY_PREF_IS_FIRST_INSTALL = "is_first_install"

    internal const val DATABASE_NAME = "AppDatabase.db"
    internal const val TABLE_USER_NAME = "USER_ENTITY"

    internal const val DATABASE_VER = 1

}