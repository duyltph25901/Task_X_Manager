package com.note.todo.task.x.managger.presentation.onb

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme

@Composable
fun OnbScreen(
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
        ) {  }
    }
}

@Composable
@Preview(showBackground = true)
fun PreviewOnbScreen() {
    Task_X_ManaggerTheme {
        OnbScreen(
            navController = NavController(
                context = LocalContext.current
            )
        )
    }
}