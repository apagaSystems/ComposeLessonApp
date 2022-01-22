package com.rob.composelessonapp.State

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rob.composelessonapp.R

@Composable
fun StateScreen() {
    var count = remember {
        mutableStateOf(0)
    }

    var countSquar = remember {
        mutableStateOf(0)
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(20.dp))
        Image(
            painter = painterResource(id = R.drawable.math),
            contentDescription = "mathPNG",
            Modifier.padding(20.dp, 20.dp)
        )
        Divider(Modifier.padding(10.dp), color = Color.LightGray, 5.dp)
        Incriment(count, countSquar)
    }
}

@Composable
fun Incriment(count: MutableState<Int>, countSquar: MutableState<Int>) {
    Row(modifier = Modifier.fillMaxWidth(0.9f), horizontalArrangement = Arrangement.Center) {
        Text(
            text = count.value.toString(),
            textAlign = TextAlign.Center,
            fontSize = 50.sp,
            fontWeight = FontWeight.ExtraBold, modifier = Modifier
                .clickable {
                    count.value = 0
                    countSquar.value = 0
                }
                .border(BorderStroke(2.dp, color = Color.Gray))
                .padding((if (count.value < 50) count.value else 10).dp, 15.dp)
        )
        Divider(modifier = Modifier.width(5.dp))
        Text(
            text = countSquar.value.toString(),
            textAlign = TextAlign.Center,
            fontSize = 50.sp,
            fontWeight = FontWeight.ExtraBold, modifier = Modifier.padding(15.dp, 15.dp)
        )
    }

    Button(
        onClick = {
            count.value++
            countSquar.value = count.value * count.value
        },
        modifier = Modifier
            .fillMaxWidth(0.7f)
            .padding(10.dp)
    ) {
        Text(text = "Inc")
    }
    Spacer(modifier = Modifier.width(40.dp))
    Button(
        onClick = {
            if (count.value > 0) {
                count.value--
                countSquar.value = count.value * count.value
            } else 0
        },
        modifier = Modifier
            .fillMaxWidth(0.7f)
            .padding(10.dp)
    ) {
        Text(text = "Dec")
    }
}