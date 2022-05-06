package com.example.fragmentkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.fragmentkotlin.adapter.ViewPagerAdapter
import com.example.fragmentkotlin.fragment.FirstFragment
import com.example.fragmentkotlin.fragment.SecondFragment
import com.example.fragmentkotlin.fragment.ThreeFragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        tabLayout?.setupWithViewPager(viewPager)

        val adapter = ViewPagerAdapter(
            supportFragmentManager,
            FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
        )
        adapter.addFragment(FirstFragment(), "Contacts")
        adapter.addFragment(SecondFragment(), "Users")
        adapter.addFragment(ThreeFragment(), "Posts")
        viewPager?.setAdapter(adapter)
    }
}