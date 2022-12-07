package com.example.gadasqrolva.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.gadasqrolva.fragments.FirstFragment
import com.example.gadasqrolva.fragments.SecondFragment
import com.example.gadasqrolva.fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> {
                FirstFragment()
            }
        }
    }
}