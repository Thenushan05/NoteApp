package com.example.thenotesapp.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Update
    suspend fun updateNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)

    @Query("SELECT * FROM NOTES ORDER BY id DESC")
    fun getAllNotes(): LiveData<List<Note>>

    @Query("SELECT FROM NOTES WHERE noteTitle LIKE : Query OR noteDesc LIKE :Query")
    fun searchNote(query: String?): LiveData<List<Note>>
}