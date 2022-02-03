package com.rob.composelessonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.rob.composelessonapp.Button.UsingCustomButton_4
import com.rob.composelessonapp.Layout.BoxScreen
import com.rob.composelessonapp.LazyColumn.LazyColumnScreen
import com.rob.composelessonapp.Navigation.NavigationScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
//            TextScreen(FontWeight.ExtraBold)
//            ColumnScreen()
//            TextFieldScreen("Enter Your Name")
//            StateScreen()
//            LazyColumnScreen()
//            CustomButtonScreen_3(icon = Icons.Default.Home, label = "toHome", isSelected = true) {}
//            UsingCustomButton_3()
//            UsingCustomButton_4()

            NavigationScreen()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

//        TextScreen()
//        TextFieldScreen("Enter Your Name")
    BoxScreen()
}