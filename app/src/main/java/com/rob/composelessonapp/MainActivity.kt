package com.rob.composelessonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.rob.composelessonapp.Button.UsingCustomButton_4
import com.rob.composelessonapp.Layout.BoxScreen
import com.rob.composelessonapp.ROOM.AppDatabase
import com.rob.composelessonapp.ROOM.Employer

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val database = Room.databaseBuilder(            // create database
            applicationContext,
            AppDatabase::class.java, "EmployerDB.db"
        ).build()
        val employerDao = database.employerDAO()    // create object of DAO class
        val emp: List<Employer> = employerDao.getAll()  // use method of DAO class

        setContent {
//            TextScreen(FontWeight.ExtraBold)
//            ColumnScreen()
//            TextFieldScreen("Enter Your Name")
//            StateScreen()
//            LazyColumnScreen()
//            CustomButtonScreen_3(icon = Icons.Default.Home, label = "toHome", isSelected = true) {}
//            UsingCustomButton_3()
            UsingCustomButton_4()
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