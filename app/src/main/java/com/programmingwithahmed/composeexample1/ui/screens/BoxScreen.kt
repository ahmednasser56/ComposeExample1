package com.programmingwithahmed.composeexample1.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.programmingwithahmed.composeexample1.ui.theme.Purple200

@Composable
fun BoxScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Purple200),
        contentAlignment = Alignment.TopCenter,
    ) {

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(color = MaterialTheme.colors.primary)
                .verticalScroll(rememberScrollState())
                .align(Alignment.BottomCenter)
        ){
            Text(text = "I Love Android", fontSize = 70.sp)
        }

        Box(
            modifier = Modifier
                .size(200.dp)
                .background(color = MaterialTheme.colors.primary)
                .verticalScroll(rememberScrollState())
        ){
            Text(text = "I Love Android", fontSize = 70.sp)
        }

    }
}