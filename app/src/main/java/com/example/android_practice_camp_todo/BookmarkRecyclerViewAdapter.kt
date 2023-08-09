package com.example.android_practice_camp_todo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_practice_camp_todo.databinding.ItemBookmarkBinding
import com.example.android_practice_camp_todo.databinding.ItemTodoBinding

class BookmarkRecyclerViewAdapter : RecyclerView.Adapter<BookmarkRecyclerViewAdapter.MyViewHolder>()  {

    inner class MyViewHolder(private val binding : ItemBookmarkBinding) : RecyclerView.ViewHolder(binding.root) {
        var text = binding.bookmarkText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding : ItemBookmarkBinding = ItemBookmarkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

    }

}