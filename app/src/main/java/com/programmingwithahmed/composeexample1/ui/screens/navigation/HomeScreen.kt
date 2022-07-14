package com.programmingwithahmed.composeexample1.ui.screens.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.programmingwithahmed.composeexample1.ui.theme.ComposeExample1Theme
import com.programmingwithahmed.composeexample1.ui.theme.Purple200

@Composable
fun HomeScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Purple200),
        contentAlignment = Alignment.Center,
    ) {


        Text(modifier = Modifier.clickable {
            navController.navigate(route = Screen.Details.route)
        }, text = "Home", fontSize = 40.sp)

    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    ComposeExample1Theme {
        HomeScreen(navController = rememberNavController())
    }
}