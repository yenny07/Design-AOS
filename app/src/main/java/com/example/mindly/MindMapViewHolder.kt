package com.example.mindly

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MindMapViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView){
    private val mainTitle : TextView = itemView.findViewById(R.id.main_title)
    private val date : TextView = itemView.findViewById(R.id.date)

    fun onBind(data : MindmapData){
        mainTitle.text = data.mainTitle
        date.text = data.date
    }
}