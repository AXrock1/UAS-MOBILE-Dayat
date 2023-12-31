package com.example.finaldicoding

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Motor(
    val name: String,
    val description: String,
    val photo: Int,
    val sound: String
) : Parcelable
