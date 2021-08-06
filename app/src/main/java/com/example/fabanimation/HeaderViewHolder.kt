package com.example.fabanimation

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(title: String){
        itemView.findViewById<TextView>(R.id.header).text = title
    }
}