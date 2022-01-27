package com.rob.composelessonapp.ProgressBar

import androidx.compose.foundation.layout.padding
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun LinearProgressBarScreen() {
    LinearProgressIndicator(
        progress = 0.2f,
        modifier = Modifier.padding(8.dp),
        color = Color.Green,
        backgroundColor = Color.Red
    )
}