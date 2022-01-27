package com.rob.composelessonapp.Button

import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color

@Composable
fun RadioButtonScreen() {
    val mRememberObserver = remember { mutableStateOf("") }
    var mText = "ok"
    RadioButton(
        selected = mRememberObserver.value == mText,
        onClick = { mRememberObserver.value = mText },
        enabled = true,
        colors = RadioButtonDefaults.colors(selectedColor = Color.Blue)
    )
}