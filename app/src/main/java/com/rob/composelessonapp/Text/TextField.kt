package com.rob.composelessonapp.Text

import androidx.compose.material.TextField
import androidx.compose.runtime.Composable

@Composable
fun TextFieldScreen(text: String) {
    var textValue = text
    TextField(value = textValue, onValueChange = { textValue = it })
}