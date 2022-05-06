package com.example.fragmentkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentkotlin.R

class ContactsAdapter(var contacts: ArrayList<String>) :
    RecyclerView.Adapter<ContactsAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var fullName: TextView

        init {
            fullName = itemView.findViewById<View>(R.id.full_name) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.first_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactsAdapter.ViewHolder, position: Int) {
        holder.fullName.text = contacts[position]
    }

    override fun getItemCount(): Int {
        return contacts.size
    }

}