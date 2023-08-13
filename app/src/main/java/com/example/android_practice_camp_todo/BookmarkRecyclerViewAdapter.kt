package com.example.android_practice_camp_todo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.android_practice_camp_todo.databinding.ItemBookmarkBinding
import com.example.android_practice_camp_todo.databinding.ItemTodoBinding
import com.example.android_practice_camp_todo.dataclass.Bookmark
import com.example.android_practice_camp_todo.dataclass.Todo

class BookmarkRecyclerViewAdapter(private val bookmark: Array<Bookmark>)
    : RecyclerView.Adapter<BookmarkRecyclerViewAdapter.MyViewHolder>()  {

    inner class MyViewHolder(val binding : ItemBookmarkBinding) : RecyclerView.ViewHolder(binding.root) {
        var text = binding.bookmarkText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding : ItemBookmarkBinding = ItemBookmarkBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return bookmark.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val bookmark : Bookmark = bookmark[position]
        holder.binding.bookmarkText.text = bookmark.title
    }

}