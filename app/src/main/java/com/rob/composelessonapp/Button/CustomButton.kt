package com.rob.composelessonapp.Button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rob.composelessonapp.Graphics.GraphicsScreen

@Composable
fun CustomButtonScreen(
    icon: ImageVector,
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
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
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                style = MaterialTheme.typography.body2,
                color = textColor,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun CustomButtonScreen_2(
    icon: ImageVector,
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val colors = MaterialTheme.colors
    val imageAlpha = if (isSelected) 1f else 0.5f
    val textColor = if (isSelected) colors.primary else colors.onSurface.copy(alpha = 0.5f)
    val backgroundColor = if (isSelected) colors.primary.copy(alpha = 0.15f) else colors.surface

    Box(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp)
            .clip(CircleShape)
            .background(backgroundColor),
        contentAlignment = Alignment.Center

    ) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .padding(4.dp)
                .clickable(onClick = onClick)
        ) {
            Image(
                imageVector = icon,
                contentDescription = "Home",
                colorFilter = ColorFilter.tint(textColor),
                alpha = imageAlpha,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = label,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                style = MaterialTheme.typography.body2,
                color = textColor,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun CustomButtonScreen_3(
    icon: ImageVector,
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit
) {
    val colors = MaterialTheme.colors
    val imageAlpha = if (isSelected) 1f else 0.5f
    val textColor = if (isSelected) colors.primary else colors.onSurface.copy(alpha = 0.5f)

    Box(
        modifier = Modifier
            .width(100.dp)
            .height(100.dp),
        contentAlignment = Alignment.Center

    ) {

        Image(
            imageVector = icon,
            contentDescription = "Home",
            colorFilter = ColorFilter.tint(Color.LightGray.copy(alpha = 0.25f)),
            alpha = imageAlpha,
            modifier = Modifier
                .size(100.dp)
                .clickable(onClick = onClick)
        )

        Text(
            text = label,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            style = MaterialTheme.typography.body2,
            color = textColor,
            modifier = Modifier
                .wrapContentWidth()
                .padding(start = 4.dp, bottom = 16.dp)

        )
    }
}


@Composable
fun UsingCustomButton_3() {
    var count = remember {
        mutableStateOf(0)
    }
    Column {
        CustomButtonScreen_3(icon = Icons.Default.Home, label = "toHome", isSelected = true) {
            count.value++
        }
        Text(text = count.value.toString())
    }
}

@Composable
fun UsingCustomButton_4() {
    var count = remember {
        mutableStateOf(0)
    }
    Column {
        GraphicsScreen {
            count.value++
        }
        Text(text = count.value.toString())
    }
}
