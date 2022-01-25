package com.rob.composelessonapp.Button

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomButtonScreen(icon: ImageVector,
                       label: String,
                       isSelected: Boolean,
                       onClick: () -> Unit) {
    val colors = MaterialTheme.colors
    val imageAlpha = if (isSelected) 1f else 0.5f
    val textColor = if (isSelected) colors.primary else colors.onSurface.copy(alpha = 0.5f)
    val backgroundColor = if (isSelected) colors.primary.copy(alpha = 0.15f) else colors.surface

    Surface(
        modifier = Modifier
            .fillMaxWidth(0.6f)
            .height(64.dp)
            .padding(start = 8.dp, end = 8.dp, top = 8.dp),
        shape = MaterialTheme.shapes.small,
        color = backgroundColor
    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(16.dp)
                .clickable(onClick = onClick)
        ) {
            Image(
                imageVector = icon,
                contentDescription = "Home",
                colorFilter = ColorFilter.tint(textColor), alpha = imageAlpha
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = label,
                fontWeight=FontWeight.Bold,
                fontSize=16.sp,
                style = MaterialTheme.typography.body2,
                color = textColor,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}