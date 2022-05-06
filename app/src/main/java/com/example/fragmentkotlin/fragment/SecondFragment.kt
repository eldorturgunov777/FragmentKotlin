package com.example.fragmentkotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentkotlin.R
import com.example.fragmentkotlin.adapter.UserAdapter
import com.example.fragmentkotlin.model.ListData

class SecondFragment : Fragment() {
    var recyclerView2: RecyclerView? = null
    var layoutManager2: RecyclerView.LayoutManager? = null
    var adapter: RecyclerView.Adapter<*>? = null
    private val list = mutableListOf<ListData>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        recyclerView2 = view.findViewById(R.id.recyclerView2)
        layoutManager2 = LinearLayoutManager(requireContext())
        adapter = UserAdapter(list)
        recyclerView2?.setLayoutManager(layoutManager2)
        recyclerView2?.setAdapter(adapter)
        list()
        return view
    }

    fun list() {
        list.add(ListData("Java"))
        list.add(ListData("Kotlin"))
        list.add(ListData("C++"))
        list.add(ListData("PHP"))
        list.add(ListData("Java Script"))
        list.add(ListData("Java"))
        list.add(ListData("Kotlin"))
        list.add(ListData("C++"))
        list.add(ListData("PHP"))
        list.add(ListData("Java Script"))
        list.add(ListData("Java"))
        list.add(ListData("Kotlin"))
        list.add(ListData("C++"))
        list.add(ListData("PHP"))
        list.add(ListData("Java Script"))
        list.add(ListData("Java"))
        list.add(ListData("Kotlin"))
        list.add(ListData("C++"))
        list.add(ListData("PHP"))
        list.add(ListData("Java Script"))
    }
}