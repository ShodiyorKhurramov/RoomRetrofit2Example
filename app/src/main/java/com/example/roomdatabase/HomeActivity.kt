package com.example.roomdatabase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.roomdatabase.adapter.UserAdapter
import com.example.roomdatabase.api.ApiClient
import com.example.roomdatabase.api.ApiService
import com.example.roomdatabase.databinding.ActivityHomeBinding
import com.example.roomdatabase.db.UserDatabase
import com.example.roomdatabase.model.UserModel

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private val adapter by lazy { UserAdapter() }
    private lateinit var apiService: ApiService
    private lateinit var userDatabase: UserDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        apiService = ApiClient.createService(ApiService::class.java)
        userDatabase = UserDatabase.getInstance(this)
        setupUi()
        setupObservers()
    }

    private fun setupUi() {
        binding.rvHome.adapter = adapter
    }

    private fun setupObservers() {
        apiService.getUsers().enqueue(object : Callback<List<UserModel>>{
            override fun onResponse(
                call: Call<List<UserModel>>,
                response: Response<List<UserModel>>
            ) {
                adapter.submitList(response.body()!!)
            }

            override fun onFailure(call: Call<List<UserModel>>, t: Throwable) {

            }
        })
    }
}