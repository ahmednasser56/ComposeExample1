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
import com.programmingwithahmed.composeexample1.ui.theme.Purple500

@Composable
fun DetailsScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Purple500),
        contentAlignment = Alignment.Center,
    ) {

        Text(modifier = Modifier.clickable {
           // navController.popBackStack()
            navController.navigate(Screen.Home.route){
                popUpTo(Screen.Home.route){
                    inclusive = true
                }
            }
        }, text = "Details", fontSize = 40.sp)

    }
}

@Preview
@Composable
fun DetailsScreenPreview() {
    ComposeExample1Theme {
        DetailsScreen(navController = rememberNavController())
    }
}