package com.example.roomdatabase.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase



import com.example.roomdatabase.db.dao.UserDao
import com.example.roomdatabase.db.entity.User


@Database(entities = [User::class], version = 1)

abstract  class UserDatabase :  RoomDatabase(){

    abstract fun productDao(): UserDao

    companion object{
        private var instance : UserDatabase ? = null
        @Synchronized
        fun getInstance(context: Context) : UserDatabase{
            if(instance == null){
                instance= Room.databaseBuilder(context,UserDatabase::class.java, " user.db")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()


            }
            return instance!!
        }


    }
}