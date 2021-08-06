package com.example.fabanimation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MonthAdapter(
    private val items: List<MonthItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int) = when (items[position]) {
        is Header -> TYPE_HEADER
        else -> TYPE_ITEM
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            TYPE_HEADER -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.header, parent, false)
                HeaderViewHolder(view)
            }
            else -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.month_layout, parent, false)
                MonthViewHolder(view)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       when(holder){
           is HeaderViewHolder -> holder.bind((items[position] as Header).title)
           is MonthViewHolder -> holder.bind((items[position] as Month))
       }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    companion object {
        const val TYPE_HEADER = 0
        const val TYPE_ITEM = 1
    }
}