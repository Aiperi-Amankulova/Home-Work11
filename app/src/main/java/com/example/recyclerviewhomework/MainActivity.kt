package com.example.recyclerviewhomework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

  class MainActivity() : AppCompatActivity(), Parcelable {

    private var go_over: Button? = null
    private var spinner: Spinner? = null

      constructor(parcel: Parcel) : this() {

      }

      override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        setupSpinner()
        listener()
        data()
    }

    private fun initView() {
        go_over = findViewById(R.id.go_over)
        spinner = findViewById(R.id.spinner)
    }

    private fun setupSpinner() {
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.lists,
            android.R.layout.simple_spinner_item
        )

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner?.adapter = adapter
    }

    private fun data(): ArrayList<DataClass> {
        val data = arrayListOf<DataClass>()
        data.add(DataClass(R.drawable.img_g))
        return data
    }

    private fun listener() {
        spinner?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (position) {
                    1 -> startActivity(Intent(this@MainActivity, SecondActivity::class.java))
                    2 -> startActivity(Intent(this@MainActivity, ThirdActivity::class.java))
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
    }

      override fun writeToParcel(parcel: Parcel, flags: Int) {

      }

      override fun describeContents(): Int {
          return 0
      }

      companion object CREATOR : Parcelable.Creator<MainActivity> {
          override fun createFromParcel(parcel: Parcel): MainActivity {
              return MainActivity(parcel)
          }

          override fun newArray(size: Int): Array<MainActivity?> {
              return arrayOfNulls(size)
          }
      }

  }