package com.example.android_practice_camp_todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android_practice_camp_todo.databinding.FragmentBookmarkBinding
import com.example.android_practice_camp_todo.dataclass.Bookmark

class BookmarkFragment : Fragment() {
    lateinit var binding : FragmentBookmarkBinding
    private lateinit var adapter: BookmarkRecyclerViewAdapter
    private lateinit var bookmarks : Array<Bookmark>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBookmarkBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bookmarks = arrayOf(
            Bookmark("북마크1"),
            Bookmark("북마크2"),
            Bookmark("북마크3"),
            Bookmark("북마크4"),
            Bookmark("북마크5"),
            Bookmark("북마크6")
        )
        adapter = BookmarkRecyclerViewAdapter(bookmarks)
        binding.bookmarkRecyclerView.adapter = adapter
    }
}