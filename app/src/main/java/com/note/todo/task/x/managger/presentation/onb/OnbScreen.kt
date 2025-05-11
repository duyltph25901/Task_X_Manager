package com.note.todo.task.x.managger.presentation.onb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.rememberPagerState
import com.note.todo.task.x.managger.R
import com.note.todo.task.x.managger.commons.SizeConst.paddingAll
import com.note.todo.task.x.managger.presentation.nav.Routes
import com.note.todo.task.x.managger.presentation.onb.components.ContainerButton
import com.note.todo.task.x.managger.presentation.onb.components.OnbPage
import com.note.todo.task.x.managger.presentation.onb.model.domain.OnbDomain.Companion.getListOnboardings
import com.note.todo.task.x.managger.ui.theme.BgColor
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme
import com.note.todo.task.x.managger.ui.theme.TextWhite40Percent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

@OptIn(ExperimentalPagerApi::class)
@Composable
fun OnbScreen(
    navController: NavController
) {
    val listOnbs = getListOnboardings()
    val pager = rememberPagerState(
        pageCount = listOnbs.size
    )
    val scope = rememberCoroutineScope()

    val txtBack = stringResource(id = R.string.back_uppercase)
    val txtNext = stringResource(id = R.string.next_uppercase)
    val txtGetStarted = stringResource(R.string.get_started_uppercase)

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
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier.weight(
                    weight = 1f
                )
            ) {
                HorizontalPager(
                    state = pager,
                    dragEnabled = false
                ) { index ->
                    OnbPage(
                        itemOnb = listOnbs[index],
                        indexCurrent = index,
                        countIndicator = listOnbs.size
                    )
                }

                Button(
                    onClick = {
                        onEventSkip(
                            navController = navController
                        )
                    },
                    contentPadding = PaddingValues(
                        all = 0.dp
                    ),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Text(
                        text = stringResource(
                            id = R.string.skip_uppercase
                        ),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            Font(R.font.lato_regular)
                        ),
                        color = TextWhite40Percent
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                val isLastOnb = pager.currentPage == listOnbs.size - 1
                ContainerButton(
                    textBtnPositive = txtBack,
                    textBtnNegative = if (isLastOnb) txtGetStarted else txtNext,
                    onEventPositive = {
                        onEventBack(
                            scope = scope,
                            pagerState = pager,
                        )
                    },
                    onEventNegative = {
                        onEventNext(
                            scope = scope,
                            navController = navController,
                            pagerState = pager,
                            countOnb = listOnbs.size
                        )
                    }
                )
            }

            Box(
                modifier = Modifier.fillMaxWidth()
                    .height(
                        height = 60.dp
                    )
            )
        }
    }
}

private fun onEventSkip(navController: NavController) =
    moveToStartScreen(
        navController = navController
    )

@OptIn(ExperimentalPagerApi::class)
private fun onEventBack(
    scope: CoroutineScope,
    pagerState: PagerState,
) {
    if (pagerState.currentPage != 0) {
        scope.launch {
            pagerState.animateScrollToPage(
                page = pagerState.currentPage - 1
            )
            cancel()
        }
    }
}

@OptIn(ExperimentalPagerApi::class)
private fun onEventNext(
    scope: CoroutineScope,
    navController: NavController,
    pagerState: PagerState,
    countOnb: Int
) {
    val isLastOnb = pagerState.currentPage == countOnb - 1
    if (isLastOnb) moveToStartScreen(
        navController = navController
    ) else scope.launch {
        pagerState.animateScrollToPage(
            page = pagerState.currentPage + 1
        )
        cancel()
    }
}

private fun moveToStartScreen(
    navController: NavController
) = navController.navigate(
    route = Routes.WelcomeRoute.route
) {
    popUpTo(
        route = Routes.OnbRoute.route
    ) {
        inclusive = true
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