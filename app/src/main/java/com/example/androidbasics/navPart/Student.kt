package com.example.androidbasics.navPart

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student (
    val name: String? = null,
    val number: Int? = null
) : Parcelable