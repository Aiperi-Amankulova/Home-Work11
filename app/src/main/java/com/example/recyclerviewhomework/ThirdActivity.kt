package com.example.recyclerviewhomework

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class ThirdActivity: AppCompatActivity() {
    private var linear: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        initView()
        data()
    }

    private fun initView() {
        linear = findViewById(R.id.linear)
    }

    private fun data() {
        val list = arrayListOf<dataClass1>()
        for (i in 1..200) {
            list.add(dataClass1("1$i"))
            val adapter = Linear(list)
            linear?.adapter = adapter
        }
        }
}