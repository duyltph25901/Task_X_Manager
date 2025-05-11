package com.note.todo.task.x.managger.presentation.onb.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.note.todo.task.x.managger.R
import com.note.todo.task.x.managger.presentation.onb.model.domain.OnbDomain
import com.note.todo.task.x.managger.presentation.onb.model.domain.OnbDomain.Companion.getListOnboardings
import com.note.todo.task.x.managger.ui.theme.BgColor
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme
import com.note.todo.task.x.managger.ui.theme.TextWhite

@Composable
fun OnbPage(
    indexCurrent: Int,
    itemOnb: OnbDomain,
    countIndicator: Int
) {

    Column(
        modifier = Modifier.fillMaxSize()
            .background(
                color = BgColor
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Image(
            modifier = Modifier,
            painter = painterResource(
                id = itemOnb.imgRes
            ),
            contentDescription = null
        )

        ContainerIndicator(
            size = countIndicator,
            pageCurrent = indexCurrent
        )

        Text(
            text = stringResource(
                id = itemOnb.titleRes
            ),
            fontSize = 32.sp,
            fontFamily = FontFamily(
                Font(R.font.lato_bold)
            ),
            lineHeight = 38.sp,
            letterSpacing = 0.sp,
            color = TextWhite
        )

        Text(
            modifier = Modifier.padding(
                horizontal = 24.dp
            ),
            text = stringResource(
                id = itemOnb.desRes,
            ),
            fontSize = 16.sp,
            fontFamily = FontFamily(
                Font(R.font.lato_regular),
            ),
            textAlign = TextAlign.Center,
            color = TextWhite,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewOnbPage() {
    Task_X_ManaggerTheme {
        val indexPreview = 0
        OnbPage(
            itemOnb = getListOnboardings()[indexPreview],
            indexCurrent = indexPreview,
            countIndicator = getListOnboardings().size
        )
    }
}