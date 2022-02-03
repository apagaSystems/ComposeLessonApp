package com.rob.composelessonapp.Navigation

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavigationScreen() {
    val navController = rememberNavController()
    var page by remember {
        mutableStateOf(1)
    }
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            page=1
            HomeScreen(page, navController)
        }

        composable("checkBox") {
            page=2
            FirstScreen(page, navController)
        }
        composable("switch") {
            page=3
            SecondScreen(page, navController)
        }

    }
}