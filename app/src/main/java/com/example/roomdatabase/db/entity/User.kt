package com.example.roomdatabase.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(


    @PrimaryKey
    val avatar: String?=null,
    val createdAt: String?=null,
    val id: String?=null,
    val name: String?=null
)