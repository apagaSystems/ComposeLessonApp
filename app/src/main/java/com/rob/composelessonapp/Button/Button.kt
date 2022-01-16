package com.rob.composelessonapp.Button

import androidx.compose.foundation.BorderStroke
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.rob.composelessonapp.R

@Composable
fun ButtonScreen() {
    Button(
        onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Gray),
        shape = MaterialTheme.shapes.medium,
        border = BorderStroke(2.dp, color = MaterialTheme.colors.primary)
    ) {
        Text(text = stringResource(id = R.string.button_A_text))
    }
}