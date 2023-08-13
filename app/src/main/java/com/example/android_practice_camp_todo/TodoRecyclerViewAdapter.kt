package com.example.android_practice_camp_todo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_practice_camp_todo.databinding.ItemTodoBinding
import com.example.android_practice_camp_todo.dataclass.Todo

class TodoRecyclerViewAdapter(private val todo : Array<Todo>)
    : RecyclerView.Adapter<TodoRecyclerViewAdapter.MyViewHolder>() {

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
        val todo : Todo = todo[position]
        holder.binding.todoText.text = todo.title
    }

    override fun getItemCount(): Int {
        return todo.size
    }
}