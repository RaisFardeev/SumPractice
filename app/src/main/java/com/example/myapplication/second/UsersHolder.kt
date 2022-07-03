package com.example.myapplication.second

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemUserBinding
import com.example.myapplication.second.User

class UsersHolder(
    private val binding: ItemUserBinding,
    private val onItemClick: (User) -> Unit,
): RecyclerView.ViewHolder(binding.root) {
    fun onBind(user: User){
        with(binding){
            tvName.text = user.name
            tvDescription.text = user.description
            root.setOnClickListener {
                onItemClick.invoke(user)
            }
        }
    }
}