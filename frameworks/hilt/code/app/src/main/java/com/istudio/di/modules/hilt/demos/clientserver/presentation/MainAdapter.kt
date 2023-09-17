package com.istudio.di.modules.hilt.demos.clientserver.presentation

import android.view.LayoutInflater
import com.istudio.di.databinding.ItemLayoutBinding
import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainAdapter(
    private val users: ArrayList<User>
) : RecyclerView.Adapter<MainAdapter.DataViewHolder>() {

    inner class DataViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        with(holder){
            with(users[position]){
                binding.apply {
                    textViewUserName.text = name
                    textViewUserEmail.text = email
                    Glide.with(binding.imageViewAvatar.context)
                        .load(avatar)
                        .into(imageViewAvatar)
                }
            }
        }
    }

    override fun getItemCount(): Int = users.size

    fun addData(list: List<User>) {
        users.addAll(list)
    }
}