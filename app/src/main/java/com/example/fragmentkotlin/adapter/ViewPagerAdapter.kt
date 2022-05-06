package com.example.fragmentkotlin.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager, behavior: Int) : FragmentPagerAdapter(fm, behavior) {
    private val fragments = ArrayList<Fragment>()
    private val fragmentTitle = ArrayList<String>()


    override fun getItem(position: Int): Fragment {
        return fragments.get(position)
    }

    override fun getCount(): Int {
        return fragments.size
    }

    fun addFragment(fragment: Fragment, title: String) {
        fragments.add(fragment)
        fragmentTitle.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return fragmentTitle.get(position)
    }
}