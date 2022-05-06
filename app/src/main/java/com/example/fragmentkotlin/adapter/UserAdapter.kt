package com.example.fragmentkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentkotlin.R
import com.example.fragmentkotlin.model.ListData

class UserAdapter(private var list: List<ListData>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView: TextView

        init {
            textView = itemView.findViewById<View>(R.id.tv_title) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.second_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserAdapter.ViewHolder, position: Int) {
        val data = list[position]
        holder.textView.setText(data.title)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}