package com.note.todo.task.x.managger.presentation.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.note.todo.task.x.managger.R
import com.note.todo.task.x.managger.commons.SharedCommon.isFirstInstall
import com.note.todo.task.x.managger.presentation.nav.Routes
import com.note.todo.task.x.managger.ui.theme.BgColor
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme
import com.note.todo.task.x.managger.ui.theme.TextWhite
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavController
) {
    val timeDelay = 3000L

    LaunchedEffect(Unit) {
        delay(timeDelay)
        moveToNextScreen(
            navController = navController
        )
    }

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = BgColor
                )
                .padding(
                    paddingValues = innerPadding
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier.size(
                    size = 113.dp
                ),
                painter = painterResource(
                    id = R.drawable.logo_application
                ),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Spacer(
                modifier = Modifier.height(
                    19.dp
                )
            )

            Text(
                text = stringResource(
                    id = R.string.app_name
                ),
                fontSize = 40.sp,
                fontFamily = FontFamily(
                    Font(R.font.lato_bold)
                ),
                color = TextWhite
            )
        }
    }
}

private fun moveToNextScreen(
    navController: NavController
) {
    if (isFirstInstall)  moveToOnbScreen(
        navController = navController
    ) else moveToLoginScreen(
        navController = navController
    )
}

private fun moveToLoginScreen(
    navController: NavController
) = navController.navigate(
    route = Routes.LoginRoute.route
) {
    popUpTo(
        route = Routes.SplashRoute.route
    ) {
        inclusive = true
    }
}

private fun moveToOnbScreen(
    navController: NavController
) = navController.navigate(
    route = Routes.OnbRoute.route
) {
    popUpTo(
        route = Routes.SplashRoute.route
    ) {
        inclusive = true
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewSplashScreen() {
    Task_X_ManaggerTheme {
        SplashScreen(
            navController = NavController(
                context = LocalContext.current
            )
        )
    }
}