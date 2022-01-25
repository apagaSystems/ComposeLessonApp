package com.rob.composelessonapp.LazyColumn

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rob.composelessonapp.R


@Composable
fun LazyColumnScreen() {
   val goodList= listOf("Bread", "Cheese", "Meet", "Sald", "Sosig", "apple", "mongo", "banana")
   val goodStore= listOf(false, true, true, false, true, false, false, true)
    val goodListState=remem
//    val goodmap=mapOf{}
        LazyColumn(modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally){
            items(items=goodList){
                ListItem(it, goodStore)
            }
        }
   }

@Composable
fun ListItem(itemText:String, inStore: List<Boolean>) {
    var index = remember { mutableStateOf(0) }
    Card(
        modifier = Modifier
            .fillMaxWidth(0.95f)
            .padding(8.dp)
            .height(105.dp),
        shape = RoundedCornerShape(25.dp, 1.dp, 25.dp, 1.dp),
        elevation = 4.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(modifier = Modifier.width(170.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.math),
                    contentDescription = "mathPNG",
                    Modifier.padding(20.dp, 20.dp)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth()) {
                    BasicText(
                        text = "Fruits",
                        style = MaterialTheme.typography.body2.copy(color = Color.LightGray.copy(alpha = 0.7f))
                    )
                }
                Text(
                    text = itemText, fontWeight = FontWeight.Bold, fontSize = 20.sp,
                    textAlign = TextAlign.Center, color = Color.DarkGray
                )
                Text(
                    text = if (inStore[index.value]) {
                        index.value+=1
                        "buy now"
                    }
                        else {
                        index.value+=1
                        "order"
                    },
                    fontWeight = FontWeight.Medium, fontSize = 14.sp,
                    textAlign = TextAlign.Center,
                    color = if (inStore[index.value]) Color.Blue else Color.Red,
                    fontStyle = FontStyle.Italic
                )

            }
        }
    }
}

