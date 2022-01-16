package com.rob.composelessonapp.Text

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextScreen(ass: FontWeight) {
    val checker = true
    Text(
        text = if (checker) "My first text " else "ok",
        color = Color.Cyan,
        fontStyle = FontStyle.Italic,
        fontWeight =ass,
        fontSize = 10.sp,
        style = MaterialTheme.typography.body2,
        textAlign = TextAlign.Center, modifier = Modifier
            .fillMaxSize()
            .padding(4.dp)
            .clickable {}
            .background(color = MaterialTheme.colors.background)
    )


    Text(
        text = checker.toString(),
        color = Color.Cyan,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 10.sp,
        textAlign = TextAlign.Center, modifier = Modifier
            .fillMaxSize()
            .padding(4.dp)
            .clickable {}
    )


}

@Composable
fun MyText(textA: String) {
    Text(text = textA, fontSize = 30.sp)
}

fun absd() {


}