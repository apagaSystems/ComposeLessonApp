package com.rob.composelessonapp.Layout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout


@Composable
fun SpaceScreen() {

    Column() {
        Text(text = "ok")
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "ok")
    }
}