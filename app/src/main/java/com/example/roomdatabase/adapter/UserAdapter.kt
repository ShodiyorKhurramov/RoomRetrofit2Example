package com.example.roomdatabase.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdatabase.R
import com.example.roomdatabase.databinding.ItemHomeBinding
import com.squareup.picasso.Picasso





import com.example.roomdatabase.model.UserModel

class UserAdapter:RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    val list : ArrayList<UserModel> = ArrayList()
    inner class ViewHolder(val binding: ItemHomeBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(){

            val user = list[adapterPosition]
            binding.apply {
                createdTv.text = user.createdAt
                usernameTv.text = user.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemHomeBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind()

    override fun getItemCount(): Int = list.size

    fun submitList(userList: List<UserModel>){
        list.addAll(userList)
        notifyDataSetChanged()
    }

}