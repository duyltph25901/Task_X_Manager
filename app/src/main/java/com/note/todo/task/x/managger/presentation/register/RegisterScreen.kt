@file:Suppress("IMPLICIT_CAST_TO_ANY")

package com.note.todo.task.x.managger.presentation.register

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.note.todo.task.x.managger.R
import com.note.todo.task.x.managger.commons.ShapeConst.roundedShape4dp
import com.note.todo.task.x.managger.commons.SizeConst.paddingAll
import com.note.todo.task.x.managger.presentation.nav.Routes
import com.note.todo.task.x.managger.ui.theme.BgColor
import com.note.todo.task.x.managger.ui.theme.BgInput
import com.note.todo.task.x.managger.ui.theme.Primary
import com.note.todo.task.x.managger.ui.theme.Primary50Percent
import com.note.todo.task.x.managger.ui.theme.Stroke
import com.note.todo.task.x.managger.ui.theme.Task_X_ManaggerTheme
import com.note.todo.task.x.managger.ui.theme.TextHint
import com.note.todo.task.x.managger.ui.theme.TextWhite
import com.note.todo.task.x.managger.ui.theme.TextWhite50Percent
import com.note.todo.task.x.managger.ui.theme.TextWhite87Percent

@Composable
fun RegisterScreen(
    navController: NavController,
    isFromWelcomeScreen: Boolean
) {
    BackHandler {
        backToPrevScreen(
            navController = navController,
            isFromWelcomeScreen = isFromWelcomeScreen
        )
    }

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize()
                .background(
                    color = BgColor
                ).padding(
                    paddingValues = innerPadding
                ).padding(
                    horizontal = paddingAll
                )
        ) {
            Spacer(
                modifier = Modifier.fillMaxWidth()
                    .height(
                        height = 40.dp
                    )
            )

            IconButton(
                modifier = Modifier.size(
                    size = 24.dp
                ),
                onClick = {
                    backToPrevScreen(
                        navController = navController,
                        isFromWelcomeScreen = isFromWelcomeScreen
                    )
                },
            ) {
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_arrow_left
                    ),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
            }

            Spacer(
                modifier = Modifier.fillMaxWidth()
                    .height(
                        height = 16.dp
                    )
            )

            Text(
                text = stringResource(
                    R.string.register
                ),
                textAlign = TextAlign.Start,
                fontSize = 32.sp,
                fontFamily = FontFamily(
                    Font(R.font.lato_bold)
                ),
                color = TextWhite87Percent
            )

            Spacer(
                modifier = Modifier.height(
                    height = 23.dp
                )
            )

            Text(
                text = stringResource(
                    id = R.string.username
                ),
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.lato_regular)
                ),
                color = TextWhite87Percent
            )

            Spacer(
                modifier = Modifier.height(
                    height = 8.dp
                )
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                maxLines = 1,
                singleLine = true,
                shape = roundedShape4dp,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = BgInput,
                    unfocusedContainerColor = BgInput,

                    unfocusedIndicatorColor = Stroke,
                    focusedIndicatorColor = Stroke
                ),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        Font(R.font.lato_regular)
                    ),
                    color = TextWhite
                ),
                placeholder = {
                    Text(
                        text = stringResource(
                            id = R.string.des_input_username
                        ),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            Font(R.font.lato_regular)
                        ),
                        color = TextHint
                    )
                },
                onValueChange = { newValue ->

                }
            )

            Spacer(
                modifier = Modifier.height(
                    height = 25.dp
                )
            )

            Text(
                text = stringResource(
                    id = R.string.password
                ),
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.lato_regular)
                ),
                color = TextWhite87Percent
            )

            Spacer(
                modifier = Modifier.height(
                    height = 8.dp
                )
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                maxLines = 1,
                singleLine = true,
                shape = roundedShape4dp,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = BgInput,
                    unfocusedContainerColor = BgInput,

                    unfocusedIndicatorColor = Stroke,
                    focusedIndicatorColor = Stroke
                ),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        Font(R.font.lato_regular)
                    ),
                    color = TextWhite
                ),
                placeholder = {
                    Text(
                        text = stringResource(
                            id = R.string.des_input_password
                        ),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            Font(R.font.lato_regular)
                        ),
                        color = TextHint
                    )
                },
                onValueChange = { newValue ->

                }
            )

            Spacer(
                modifier = Modifier.height(
                    height = 25.dp
                )
            )

            Text(
                text = stringResource(
                    id = R.string.confirm_password
                ),
                fontSize = 16.sp,
                fontFamily = FontFamily(
                    Font(R.font.lato_regular)
                ),
                color = TextWhite87Percent
            )

            Spacer(
                modifier = Modifier.height(
                    height = 8.dp
                )
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                value = "",
                maxLines = 1,
                singleLine = true,
                shape = roundedShape4dp,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = BgInput,
                    unfocusedContainerColor = BgInput,

                    unfocusedIndicatorColor = Stroke,
                    focusedIndicatorColor = Stroke
                ),
                textStyle = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        Font(R.font.lato_regular)
                    ),
                    color = TextWhite
                ),
                placeholder = {
                    Text(
                        text = stringResource(
                            id = R.string.des_input_password
                        ),
                        fontSize = 16.sp,
                        fontFamily = FontFamily(
                            Font(R.font.lato_regular)
                        ),
                        color = TextHint
                    )
                },
                onValueChange = { newValue ->

                }
            )
            
            Spacer(
                modifier = Modifier.height(
                    height = 40.dp
                )
            )

            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {

                },
                contentPadding = PaddingValues(
                    vertical = 12.dp
                ),
                shape = roundedShape4dp,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Primary,
                    contentColor = Color.White,
                    disabledContentColor = TextWhite50Percent,
                    disabledContainerColor = Primary50Percent
                ),
                enabled = false
            ) {
                Text(
                    text = stringResource(
                        id = R.string.register
                    ),
                    fontSize = 16.sp,
                    fontFamily = FontFamily(
                        Font(R.font.lato_regular)
                    ),
                )
            }

            Spacer(
                modifier = Modifier.weight(
                    weight = 1f
                )
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                TextButton(
                    onClick = {
                        backToPrevScreen(
                            navController = navController,
                            isFromWelcomeScreen = isFromWelcomeScreen

                        )
                    }
                ) {
                    val textStyleMsgBackToLogin = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                fontSize = 12.sp,
                                color = Stroke,
                                fontFamily = FontFamily(
                                    Font(R.font.lato_regular)
                                )
                            )
                        ) {
                            append(
                                text = stringResource(
                                    id = R.string.already_have_an_account
                                )
                            )
                        }

                        withStyle(
                            style = SpanStyle(
                                fontSize = 12.sp,
                                color = TextWhite,
                                fontFamily = FontFamily(
                                    Font(R.font.lato_regular)
                                )
                            )
                        ) {
                            append(
                                text = " ${
                                    stringResource(
                                        id = R.string.already_have_an_account
                                    )
                                }"
                            )
                        }
                    }

                    Text(
                        text = textStyleMsgBackToLogin
                    )
                }
            }

            Spacer(
                modifier = Modifier.fillMaxWidth()
                    .height(
                        height = 20.dp
                    )
            )
        }
    }
}

private fun backToPrevScreen(
    navController: NavController,
    isFromWelcomeScreen: Boolean
) =
    if (isFromWelcomeScreen) {
        navController.navigate(
            route = Routes.LoginRoute.route
        ) {
            popUpTo(
                route = Routes.RegisterRoute.route
            ) {
                inclusive = true
            }
        }
    } else navController.popBackStack()

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