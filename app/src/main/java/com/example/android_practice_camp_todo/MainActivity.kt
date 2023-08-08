package com.example.android_practice_camp_todo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_practice_camp_todo.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val tabTextList = listOf("Todo", "Bookmark")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.mainViewPager.adapter = ViewPagerAdapter(this)

        TabLayoutMediator(binding.mainTab, binding.mainViewPager) { tab, pos ->
            tab.text = tabTextList[pos]
        }.attach()
    }
}