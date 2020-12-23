package com.example.mindly

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MindMapAdapter (private val context: Context) : RecyclerView.Adapter<MindMapViewHolder>(){

    var data = mutableListOf<MindmapData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MindMapViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.card_mindmap, parent, false)
        return MindMapViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: MindMapViewHolder, position: Int) {
        holder.onBind(data[position])
    }
}