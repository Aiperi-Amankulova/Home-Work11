package com.example.recyclerviewhomework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_spinner.view.*

class Linear(private val list: ArrayList<dataClass1>): RecyclerView.Adapter<Linear.LinearV>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LinearV {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_linear,parent, false)
        return  LinearV(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: LinearV, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    class LinearV(view: View):RecyclerView.ViewHolder(view){
        fun bind(item: dataClass1) {
            itemView.tvSpinner.text=item.tvSpinner
        }
    }
}