package com.note.todo.task.x.managger.presentation.login

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
import com.note.todo.task.x.managger.ui.theme.BgColor
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme

@Composable
fun LoginScreen(
    navController: NavController
) {
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
        ) {  }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewLoginScreen() {
    Task_X_ManaggerTheme {
        LoginScreen(
            navController = NavController(
                context = LocalContext.current
            )
        )
    }
}