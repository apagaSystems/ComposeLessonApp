package com.rob.composelessonapp.Navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(pageNumber: Int, navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp), horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "Prev",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable { })
            Text(text = pageNumber.toString(), fontSize = 16.sp,  color = Color.Red)
            Text(
                text = "Next",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable { navController.navigate("checkBox") })
        }


    }
}

@Composable
fun FirstScreen(pageNumber: Int, navController: NavController) {

    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp), horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "Prev",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable { navController.navigate("home") })
            Text(text = pageNumber.toString(), fontSize = 16.sp, color = Color.Red)
            Text(
                text = "Next",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable { navController.navigate("switch") })
        }


    }
}

@Composable
fun SecondScreen(pageNumber: Int, navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp), horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "Prev",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable { navController.navigate("checkBox") })
            Text(text = pageNumber.toString(), fontSize = 16.sp, color = Color.Red)
            Text(
                text = "Next",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable { })
        }


    }
}

