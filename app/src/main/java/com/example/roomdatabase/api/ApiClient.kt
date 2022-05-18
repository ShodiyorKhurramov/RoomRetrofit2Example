package com.example.roomdatabase.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {

    var BASE_URL="https://6231daa559070d92733ca0bd.mockapi.io/"
    fun getRetrofit():Retrofit{
        val build=Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
        return build
    }

    fun <T> createService(service: Class<T>):T{
        return getRetrofit().create(service)
    }
    val photoService: ApiService = getRetrofit().create(ApiService::class.java)

}