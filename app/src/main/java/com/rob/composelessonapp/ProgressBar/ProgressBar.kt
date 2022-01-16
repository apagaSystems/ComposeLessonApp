package com.rob.composelessonapp.ProgressBar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ProgressBarScreen() {
    CircularProgressIndicator(
        progress = 0.5f,
        strokeWidth = 2.dp,
        modifier = Modifier.fillMaxWidth(0.8f)
    )

}