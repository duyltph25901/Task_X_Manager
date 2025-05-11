package com.note.todo.task.x.managger.presentation.onb.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.note.todo.task.x.managger.commons.SizeConst.padding8dp
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme

@Composable
fun ContainerIndicator(
    size: Int,
    pageCurrent: Int,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(size) { index ->
            DotIndicator(
                isSelected = (index == pageCurrent)
            )
            val isLastItem = index == size - 1
            if (isLastItem.not()) {
                Box(
                    modifier = Modifier.width(
                        width = padding8dp
                    )
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewContainerIndicator() {
    Task_X_ManaggerTheme {
        ContainerIndicator(
            size = 3,
            pageCurrent = 0
        )
    }
}