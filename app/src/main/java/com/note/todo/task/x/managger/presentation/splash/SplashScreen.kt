package com.note.todo.task.x.managger.presentation.splash

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme

@Composable
fun SplashScreen(
    navController: NavController
) {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .padding(
                    paddingValues = innerPadding
                )
        ) {
            Text(
                text = "Splash Screen"
            )
        }
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