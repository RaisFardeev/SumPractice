package com.example.myapplication.second

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemUserBinding

class UserAdapter(
    private val list:List<User>,
    private val onItemClick:(User) -> Unit,
): RecyclerView.Adapter<UsersHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int): UsersHolder = UsersHolder(
        ItemUserBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ),onItemClick
    )

    override fun onBindViewHolder(
        holder: UsersHolder,
        position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int= list.size
}