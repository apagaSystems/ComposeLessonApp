package com.rob.composelessonapp.LazyRow

import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun LazyRowScreen() {
    val goodList = listOf("Bread", "Cheese", "Meet", "Sold", "Bread", "Apple", "Mongo", "Banana")

    LazyRow {
        items(items = goodList) {
            Card(shape = RoundedCornerShape(25.dp, 1.dp, 25.dp, 1.dp)) {
                Text(text = it.toString())
            }
        }
    }
}