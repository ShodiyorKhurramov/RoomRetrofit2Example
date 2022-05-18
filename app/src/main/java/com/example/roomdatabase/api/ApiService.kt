package com.example.roomdatabase.api

import com.example.roomdatabase.model.UserModel
import retrofit2.Call
import retrofit2.http.GET


@JvmSuppressWildcards
interface ApiService {
    @GET("users")
    fun getUsers(): Call<List<UserModel>>
}