package com.programmingwithahmed.composeexample1.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.programmingwithahmed.composeexample1.ui.theme.Purple200

@Composable
fun ColumnScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Purple200),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        SurfaceItem(weight = 1f, color = MaterialTheme.colors.primary)
        SurfaceItem(weight = 2f, color = MaterialTheme.colors.primaryVariant)
        SurfaceItem(weight = 3f, color = MaterialTheme.colors.secondary)

    }
}

@Composable
fun ColumnScope.SurfaceItem(weight: Float, color: Color) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .weight(weight), color = color
    ) {}
}
