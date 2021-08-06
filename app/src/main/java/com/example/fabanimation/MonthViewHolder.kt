package com.example.fabanimation

import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView

class MonthViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    fun bind(month: Month) {
        itemView.findViewById<TextView>(R.id.text_month_1).text = month.month1
        if (month.month2.isNullOrEmpty()) {
            itemView.findViewById<TextView>(R.id.month_card_2).isVisible = false
            itemView.findViewById<TextView>(R.id.view2).isVisible = false
            itemView.findViewById<TextView>(R.id.imageView2).isVisible = false
        } else {
            itemView.findViewById<TextView>(R.id.month_card_2).isVisible = true
            itemView.findViewById<TextView>(R.id.view2).isVisible = true
            itemView.findViewById<TextView>(R.id.imageView2).isVisible = true
            itemView.findViewById<TextView>(R.id.text_month_2).text = month.month2
        }
    }
}