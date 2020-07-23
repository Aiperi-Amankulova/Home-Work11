package com.example.recyclerviewhomework

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class SpinnerAdapter(context: Context, resource: Int, private val objects: List<DataClass>):
    ArrayAdapter<DataClass>(context, resource, objects){

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(context).inflate(R.layout.item_spinner,parent,false)
        val tvSpinner = view.findViewById<TextView>(R.id.tvSpinner)
        tvSpinner.text=(objects[position].tvSpinner)

        return view
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = LayoutInflater.from(context).inflate(R.layout.item_spinner,parent,false)
        val tvSpinner = view.findViewById<TextView>(R.id.tvSpinner)
        tvSpinner.text=(objects[position].tvSpinner)

        return  view
    }
}
