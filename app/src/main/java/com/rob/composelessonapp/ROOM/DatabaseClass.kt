package com.rob.composelessonapp.ROOM

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Employer::class, Education::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun employerDAO(): EmployerDAO
}