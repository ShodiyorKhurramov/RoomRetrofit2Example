package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.roomdatabase.databinding.ActivityMainBinding
import com.example.roomdatabase.db.AppDatabase
import com.example.roomdatabase.db.entity.Product

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var appDatabase: AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        appDatabase = AppDatabase.getInstance(this)

        binding.apply {
            saveBtn.setOnClickListener{
                val product = Product(
                    name = prductName.text.toString(),
                    price = prductPrice.text.toString().toInt()

                )
//                appDatabase.productDao().inserProduct(product)
            }

//            getAllProductBtn.setOnClickListener{
//                Log.d("product",appDatabase.productDao().getAllProduct().toString())
//            }
//
//            deleteAllBtn.setOnClickListener{
//                Log.d("product",appDatabase.productDao().clearProduct() .toString())
//            }
//
//
//            deleteBtn.setOnClickListener{
//                appDatabase.productDao().removeProduct(1)
//            }
//
//            getProductBtn.setOnClickListener{
//                appDatabase.productDao().getPostByID(1)
//            }

        }
    }
}