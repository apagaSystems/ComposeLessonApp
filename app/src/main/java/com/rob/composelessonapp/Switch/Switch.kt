package com.rob.composelessonapp.Switch

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SwitchScreen() {
    val mRemember = remember { mutableStateOf(false) }

    Switch(
        checked = mRemember.value,
        onCheckedChange = { mRemember.value = it },
        enabled = true,
        colors = SwitchDefaults.colors(
            checkedThumbColor = Color.Cyan
        ),
        modifier = Modifier.padding(8.dp)
    )
}