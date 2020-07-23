package com.example.recyclerviewhomework

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataClass(
    val img_Linear : Int,
    val tvSpinner: String = "choose recyclerview"

): Parcelable