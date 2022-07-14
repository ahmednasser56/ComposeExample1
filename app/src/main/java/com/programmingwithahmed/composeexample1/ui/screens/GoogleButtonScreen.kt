package com.programmingwithahmed.composeexample1.ui.screens

import android.util.Log
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.programmingwithahmed.composeexample1.R

@Composable
fun GoogleButtonScreen() {

    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize()
            .padding(16.dp),
    ) {
        GoogleButton(text = "Sign up with Google", loadingText = "Creating Account..."){
            Log.e("Nasser", "Google Button Clicked")
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun GoogleButton(text: String, loadingText: String, onClicked: () -> Unit) {

    var clicked by remember { mutableStateOf(false) }

    Surface(
        onClick = { clicked = !clicked },
        shape = MaterialTheme.shapes.large,
        border = BorderStroke(width = 1.dp, color = Color.Gray),
        color = Color.White
    ) {
        Row(
            modifier = Modifier
                .padding(
                    start = 12.dp,
                    end = 16.dp,
                    top = 16.dp,
                    bottom = 16.dp
                )
                .animateContentSize(
                    animationSpec = tween(durationMillis = 300, easing = LinearOutSlowInEasing)
                ),
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_google),
                contentDescription = "Google Icon",
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = if(clicked) loadingText else text)

            if (clicked) {
                Spacer(modifier = Modifier.width(8.dp))
                CircularProgressIndicator(
                    modifier = Modifier.size(16.dp),
                    color = MaterialTheme.colors.primary,
                    strokeWidth = 2.dp
                )
                onClicked()
            }
        }
    }
}