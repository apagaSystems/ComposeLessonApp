package com.rob.composelessonapp.ROOM

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface EmployerDao {
    @Query("SELECT * FROM Employer WHERE name LIKE :name")
    fun findByTitle(name: String): LiveData<List<Employer>>
}