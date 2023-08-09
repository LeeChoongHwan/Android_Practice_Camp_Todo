package com.example.android_practice_camp_todo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_practice_camp_todo.databinding.ItemTodoBinding

class TodoRecyclerViewAdapter : RecyclerView.Adapter<TodoRecyclerViewAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding : ItemTodoBinding) : RecyclerView.ViewHolder(binding.root) {
        var text = binding.todoText
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TodoRecyclerViewAdapter.MyViewHolder {
        val binding : ItemTodoBinding = ItemTodoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TodoRecyclerViewAdapter.MyViewHolder, position: Int) {
        holder.binding.todoText.text = "text"
    }

    override fun getItemCount(): Int =10
}