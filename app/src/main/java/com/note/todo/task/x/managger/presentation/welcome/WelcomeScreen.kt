package com.note.todo.task.x.managger.presentation.welcome

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.note.todo.task.x.managger.R
import com.note.todo.task.x.managger.commons.AppConst.TAG_DEBUG
import com.note.todo.task.x.managger.commons.Logger.logD
import com.note.todo.task.x.managger.commons.ShapeConst.roundedShape4dp
import com.note.todo.task.x.managger.commons.SharedCommon.isFirstInstall
import com.note.todo.task.x.managger.commons.SizeConst.paddingAll
import com.note.todo.task.x.managger.presentation.nav.Routes
import com.note.todo.task.x.managger.ui.theme.BgColor
import com.note.todo.task.x.managger.ui.theme.Primary
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme
import com.note.todo.task.x.managger.ui.theme.TextWhite
import com.note.todo.task.x.managger.ui.theme.TextWhite67Percent

@Composable
fun WelcomeScreen(
    navController: NavController
) {

    LaunchedEffect(Unit) {
        cacheFirstInstallFail()
    }

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .background(
                    color = BgColor
                )
                .padding(
                    paddingValues = innerPadding
                )
                .padding(
                    all = paddingAll
                )
        ) {
            Spacer(
                modifier = Modifier.fillMaxWidth()
                    .height(
                        height = 58.dp
                    )
            )

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(
                    id = R.string.title_welcome
                ),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(
                    Font(R.font.lato_bold)
                ),
                color = TextWhite,
                fontSize = 32.sp
            )

            Spacer(
                modifier = Modifier.fillMaxWidth()
                    .height(
                        height = 26.dp
                    )
            )

            Text(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(
                    id = R.string.des_welcome
                ),
                textAlign = TextAlign.Center,
                fontFamily = FontFamily(
                    Font(R.font.lato_regular)
                ),
                color = TextWhite67Percent,
                fontSize = 16.sp
            )

            Spacer(
                modifier = Modifier.weight(
                    weight = 1f
                )
            )

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    moveToLoginScreen(
                        navController = navController
                    )
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Primary,
                ),
                shape = roundedShape4dp,
                contentPadding = PaddingValues(
                    vertical = 12.dp
                )
            ) {
                Text(
                    text = stringResource(
                        id = R.string.login_uppercase
                    ),
                    fontFamily = FontFamily(
                        Font(R.font.lato_regular)
                    ),
                    fontSize = 16.sp,
                    color = TextWhite,
                )
            }

            Spacer(
                modifier = Modifier.height(
                    height = 28.dp
                )
            )

            OutlinedButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    moveToRegisterScreen(
                        navController = navController
                    )
                },
                contentPadding = PaddingValues(
                    vertical = 12.dp
                ),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.Black,
                    contentColor = TextWhite,
                ),
                shape = roundedShape4dp,
                border = BorderStroke(
                    width = 2.dp,
                    color = Primary
                )
            ) {
                Text(
                    text = stringResource(
                        id = R.string.create_account_uppercase
                    ),
                    fontFamily = FontFamily(
                        Font(R.font.lato_regular)
                    ),
                    color = TextWhite,
                    fontSize = 16.sp
                )
            }

            Spacer(
                modifier = Modifier.fillMaxWidth()
                    .height(
                        height = 54.dp
                    )
            )
        }
    }
}

private fun moveToLoginScreen(
    navController: NavController,
) = moveToNextScreen(
    navController = navController,
    route = Routes.LoginRoute.route
)

private fun moveToRegisterScreen(
    navController: NavController
) = moveToNextScreen(
    navController = navController,
    route = Routes.RegisterRoute.passDataFlag(
        isFromWelcomeScreen = true
    )
)

private fun moveToNextScreen(
    navController: NavController,
    route: String
) = navController.navigate(
    route = route
) {
    popUpTo(
        route = Routes.WelcomeRoute.route
    ) {
        inclusive = true
    }
}

private fun cacheFirstInstallFail() {
    if (isFirstInstall) isFirstInstall = false
}

@Preview(showBackground = true)
@Composable
private fun PreviewWelcomeScreen() {
    Task_X_ManaggerTheme {
        WelcomeScreen(
            navController = NavController(
                context = LocalContext.current
            )
        )
    }
}