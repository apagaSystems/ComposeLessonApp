package com.rob.composelessonapp.ROOM

import androidx.room.*

@Dao
interface EmployerDAO {
    @Query("SELECT * FROM Employer")
    fun getAll(): List<Employer>

    @Query("SELECT * FROM Employer WHERE name LIKE :name")
    fun findByTitle(name: String): Employer

    @Insert
    fun insertAll(vararg employer:  Employer)

    @Delete
    fun delete(employer: Employer)

    @Update
    fun updateTodo(vararg employer: Employer)
}