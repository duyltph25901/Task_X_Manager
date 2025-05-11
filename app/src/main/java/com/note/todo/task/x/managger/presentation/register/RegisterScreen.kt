package com.note.todo.task.x.managger.presentation.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.note.todo.task.x.managger.commons.AppConst.TAG_DEBUG
import com.note.todo.task.x.managger.commons.Logger.logD
import com.note.todo.task.x.managger.ui.theme.BgColor
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme

@Composable
fun RegisterScreen(
    navController: NavController,
    isFromWelcomeScreen: Boolean
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .background(
                    color = BgColor
                ).padding(
                    paddingValues = innerPadding
                )
        ) {
            logD(TAG_DEBUG, "Is from welcome screen: $isFromWelcomeScreen")
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRegisterScreen() {
    Task_X_ManaggerTheme {
        RegisterScreen(
            navController = NavController(
                context = LocalContext.current
            ),
            isFromWelcomeScreen = false
        )
    }
}