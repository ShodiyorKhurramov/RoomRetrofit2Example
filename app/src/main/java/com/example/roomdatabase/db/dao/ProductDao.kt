package com.example.roomdatabase.db.dao

import androidx.room.*
import com.example.roomdatabase.db.entity.User


@Dao
interface UserDao {
    @Insert()
    fun inserUser(userDao: User)

    @Query("SELECT * FROM user")
    fun getAllUser() : List<User>
//
//    @Query("SELECT * FROM user WHERE userId=:userId")
//    fun getPostByID(userId: Int): User
//
//
//
//
//    @Delete
//    fun deletePostWithDelete(user:User)
//
//    @Query("DELETE FROM user")
//    fun clearUser()
//
//    @Query("DELETE FROM user WHERE userId=:userId")
//    fun removeUser(userId:Int)
//
//
//
//
//    @Update
//    fun updatePostWithUpdate(user: User)
//
//
//    @Query("UPDATE user SET name=:name WHERE userId=:userId")
//    fun updatePost(name:String,userId:Int)

}