package com.example.myapplication.data

import Todo
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow


@Dao
interface TodoDao {
    //Dao is data access object
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTodo(todo: Todo)

    @Delete

    suspend fun deleteTodo(todo: Todo)

    @Query(value = "SELECT * FROM todo WHERE id = id")

    suspend fun getTodoById(todo: Todo)

    @Query(value = "SELECT * FROM todo")

    fun getTodos(): Flow<List<Todo>>
}
