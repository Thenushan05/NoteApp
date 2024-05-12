package com.example.thenotesapp.repository

import com.example.thenotesapp.database.NoteDatabase
import com.example.thenotesapp.model.Note

class NoteRepository (private val db: NoteDatabase){
    suspend fun insertNote(note: Note) = db.getNotesDao().insertNote(note)
    suspend fun deleteNote(note: Note) = db.getNotesDao().deleteNote(note)
    suspend fun updateNote(note: Note) = db.getNotesDao().updateNote(note)

    fun getAllNotes() = db.getNotesDao().getAllNotes()
    fun searchNote(query: String?) = db.getNotesDao().searchNote(query)
}