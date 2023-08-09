package com.example.android_practice_camp_todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_practice_camp_todo.databinding.FragmentBookmarkBinding
import com.example.android_practice_camp_todo.databinding.FragmentTodoBinding

class TodoFragment : Fragment() {
    lateinit var binding : FragmentTodoBinding
    private lateinit var adapter: TodoRecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTodoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = TodoRecyclerViewAdapter()
        binding.todoRecyclerView.adapter = adapter
    }
}