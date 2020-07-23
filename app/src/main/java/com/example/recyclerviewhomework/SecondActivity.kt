package com.example.recyclerviewhomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity: AppCompatActivity() {

    private var grid : RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)

        initView()
        getData()
        setupAdapters()
    }

    private fun initView(){
        grid = findViewById(R.id.grid)
    }

    private fun getData(): ArrayList<DataClass>{
        val data = arrayListOf< DataClass>()
        for (i in 1..500){
            data.add(DataClass(i, "data $i" ))
        }
        return data
    }
    private fun setupAdapters() {
        val adapter = Adapter(getData())
        grid?.layoutManager= GridLayoutManager(applicationContext, 2)
        grid?.adapter=adapter

        }
    }



