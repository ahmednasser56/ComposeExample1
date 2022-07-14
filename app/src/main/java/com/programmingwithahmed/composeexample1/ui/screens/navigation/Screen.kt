package com.programmingwithahmed.composeexample1.ui.screens.navigation

sealed class Screen (val route: String) {
    object Home: Screen(route = "home_screen")
    object Details: Screen(route = "details_screen")
}
