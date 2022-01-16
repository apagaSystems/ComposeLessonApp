package com.rob.composelessonapp.Layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun BoxScreen() {
    Box(Modifier.fillMaxSize()) {
        Text(text = "first", modifier = Modifier.align(Alignment.TopStart))
        Text(text = "Second", modifier = Modifier.align(Alignment.Center))
        Text(text = "Next", modifier = Modifier.align(Alignment.BottomEnd))
    }
}