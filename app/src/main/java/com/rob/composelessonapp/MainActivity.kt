package com.rob.composelessonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.rob.composelessonapp.Layout.BoxScreen
import com.rob.composelessonapp.Layout.ColumnScreen
import com.rob.composelessonapp.Layout.RowScreen
import com.rob.composelessonapp.State.StateScreen
import com.rob.composelessonapp.Text.TextFieldScreen
import com.rob.composelessonapp.Text.TextScreen
import com.rob.composelessonapp.ui.theme.ComposeLessonAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//                    TextScreen(FontWeight.ExtraBold)
            ColumnScreen()
//            TextFieldScreen("Enter Your Name")
            StateScreen()
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

//        TextScreen()
//    TextFieldScreen("Enter Your Name")
    BoxScreen()
}