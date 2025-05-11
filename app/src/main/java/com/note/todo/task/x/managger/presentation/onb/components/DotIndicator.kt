package com.note.todo.task.x.managger.presentation.onb.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.note.todo.task.x.managger.commons.ShapeConst.roundedShapeMax
import com.note.todo.task.x.managger.ui.theme.DotIndicatorActive
import com.note.todo.task.x.managger.ui.theme.DotIndicatorUnActive
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme

@Composable
fun DotIndicator(
    isSelected: Boolean,
) {
    Box(
        modifier = Modifier.width(
            width = 26.dp
        ).height(
            height = 4.dp
        ).clip(
            shape = roundedShapeMax
        ).background(
            color = if (isSelected) DotIndicatorActive else DotIndicatorUnActive
        )
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewDotIndicator() {
    Task_X_ManaggerTheme {
        DotIndicator(
            isSelected = false
        )
    }
}