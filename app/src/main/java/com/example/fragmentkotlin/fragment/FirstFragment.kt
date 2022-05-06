package com.example.fragmentkotlin.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentkotlin.R
import com.example.fragmentkotlin.adapter.ContactsAdapter

class FirstFragment : Fragment() {
    var contacts = ArrayList<String>()
    var recyclerView: RecyclerView? = null
    var layoutManager: RecyclerView.LayoutManager? = null
    var adapter: RecyclerView.Adapter<*>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_first, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)
        recyclerView?.setHasFixedSize(true)
        layoutManager = LinearLayoutManager(requireContext())
        adapter = ContactsAdapter(contacts)
        recyclerView?.setLayoutManager(layoutManager)
        recyclerView?.setAdapter(adapter)
        list()
        return return view
    }

    fun list() {
        contacts.add("1234")
        contacts.add("1234")
        contacts.add("xzv")
        contacts.add("zvzx")
        contacts.add("123zxv4")
        contacts.add("zvzxv")
        contacts.add("zv")
        contacts.add("1234")
        contacts.add("1234")
        contacts.add("1234")
        contacts.add("xzv")
        contacts.add("zvzx")
        contacts.add("123zxv4")
        contacts.add("zvzxv")
        contacts.add("zv")
        contacts.add("1234")
    }
}