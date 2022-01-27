package com.rob.composelessonapp.CheckBox

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun CheckBoxScreen() {
    Column {
        val isChecked = remember { mutableStateOf(false) }
        Row {
            Checkbox(checked = true, onCheckedChange = { isChecked.value = it }, enabled = true)
            Text(text = "Mongo")

        }
    }
}