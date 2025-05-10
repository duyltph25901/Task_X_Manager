package com.note.todo.task.x.managger.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import com.note.todo.task.x.managger.presentation.nav.NavGraph
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Application()
        }
    }

    @Composable
    private fun Application() {
        Task_X_ManaggerTheme {
            NavGraph()
        }
    }
}