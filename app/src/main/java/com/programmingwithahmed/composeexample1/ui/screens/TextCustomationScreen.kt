package com.programmingwithahmed.composeexample1.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.programmingwithahmed.composeexample1.R

@Composable
fun TextCustomizationScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),

        ) {
        Text(
            text = stringResource(id = R.string.i_love_android),
            modifier = Modifier
                .background(MaterialTheme.colors.primary)
                .padding(24.dp)
                .fillMaxWidth(),
            color = Color.White,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        CustomAnnotatedText()
        Text(
            text = "Ahmed".repeat(100),
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),
            color = MaterialTheme.colors.primary,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Composable
fun CustomAnnotatedText(){
    Text(
        buildAnnotatedString {
            withStyle(style = SpanStyle(
                color = MaterialTheme.colors.primary,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Bold,
            )
            ){
                append("A")
            }
            append("hmed")
        }
    )
}