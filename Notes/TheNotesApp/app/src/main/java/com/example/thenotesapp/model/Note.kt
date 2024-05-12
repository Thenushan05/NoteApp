package com.example.thenotesapp.model

import android.os.Parcelable

@Entity(tableName ="notes")
@Parcelize
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int
    val noteTitle: String,
    val noteDesc: String
):Parcelable
