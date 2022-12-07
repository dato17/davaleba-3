package com.example.gadasqrolva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.viewpager2.widget.ViewPager2
import com.example.gadasqrolva.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.hide()


        viewPager2 = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)
        viewPager2.adapter = viewPagerFragmentAdapter
        TabLayoutMediator(tabLayout, viewPager2){tab, position ->
            when(position){
                0 -> "FIRST"
                1 -> "SECOND"
                2 -> "THIRD"
            }
        }.attach()
    }
}