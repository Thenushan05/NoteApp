package com.example.thenotesapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.thenotesapp.model.Note

@Database(entities =[Note::class], version =1 )
abstract class NoteDatabase: RoomDatabase() {

    abstract fun getNotesDao(): NoteDao

    companion object{
        @Volatile
        private var instance: NoteDatabase? = null
        private val LOCK =Any()

        operator fun invoke(context: Context) = instance ?:
        synchronized(LOCK){
            instance ?:
            createDatabase() se(context).also{
                instance = it
            }
        }


        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                NoteDatabase:: class.java
                "note_db"
            ).build()
    }
}