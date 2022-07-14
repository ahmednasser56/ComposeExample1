package com.programmingwithahmed.composeexample1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.programmingwithahmed.composeexample1.ui.screens.navigation.SetupNavGraph
import com.programmingwithahmed.composeexample1.ui.theme.ComposeExample1Theme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeExample1Theme {
                NavigationScreen()
            }
        }
    }
}


lateinit var navController: NavHostController
@Composable
fun NavigationScreen() {
    navController = rememberNavController()
    SetupNavGraph(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeExample1Theme {
        NavigationScreen()
    }
}