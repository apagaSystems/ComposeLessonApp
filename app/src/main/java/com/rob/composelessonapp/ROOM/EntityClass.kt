package com.rob.composelessonapp.ROOM

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Employer(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "surname") var surname: String,
    @ColumnInfo(name = "education") var education: String,
    @ColumnInfo(name = "birthDay") var birthday: Date
)

@Entity
data class Education(
    @PrimaryKey(autoGenerate = true) var id: Int,
    @ColumnInfo(name = "educationLevel") var level: String,
    @ColumnInfo(name = "Degree") var degree: String,

)