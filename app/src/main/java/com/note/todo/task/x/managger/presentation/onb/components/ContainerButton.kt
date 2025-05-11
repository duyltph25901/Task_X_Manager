package com.note.todo.task.x.managger.presentation.onb.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.note.todo.task.x.managger.R
import com.note.todo.task.x.managger.commons.ShapeConst.roundedShape4dp
import com.note.todo.task.x.managger.ui.theme.Primary
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme
import com.note.todo.task.x.managger.ui.theme.TextWhite
import com.note.todo.task.x.managger.ui.theme.TextWhite40Percent

@Composable
fun ContainerButton(
    textBtnPositive: String,
    textBtnNegative: String,
    onEventPositive: () -> Unit,
    onEventNegative: () -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = {
                onEventPositive.invoke()
            },
            contentPadding = PaddingValues(
                all = 0.dp
            ),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent
            )
        ) {
            Text(
                text = textBtnPositive,
                color = TextWhite40Percent,
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.lato_regular)
                )
            )
        }

        Button(
            onClick = {
                onEventNegative.invoke()
            },
            shape = roundedShape4dp,
            colors = ButtonDefaults.buttonColors(
                containerColor = Primary
            ),
            contentPadding = PaddingValues(
                horizontal = 24.dp,
                vertical = 12.dp
            )
        ) {
            Text(
                text = textBtnNegative,
                color = TextWhite,
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.lato_regular)
                )
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewContainerButton() {
    Task_X_ManaggerTheme {
        ContainerButton(
            textBtnPositive = "BACK",
            textBtnNegative = "STARTED",
            onEventPositive = {},
            onEventNegative = {},
        )
    }
}