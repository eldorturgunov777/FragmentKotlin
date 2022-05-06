package com.example.fragmentkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentkotlin.R
import com.example.fragmentkotlin.model.ListData
import com.example.fragmentkotlin.model.PostData

class PostAdapter(private var list: List<PostData>) :
    RecyclerView.Adapter<PostAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView
        var desc: TextView

        init {
            title = itemView.findViewById<View>(R.id.title) as TextView
            desc = itemView.findViewById<View>(R.id.desc) as TextView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.three_row, parent, false)
        return PostAdapter.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostAdapter.ViewHolder, position: Int) {
        val data = list[position]
        holder.title.setText(data.title)
        holder.desc.setText(data.desc)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}