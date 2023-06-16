package com.example.develovmain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Datamentor(
    val imgDatamentor: Int,
    val nameDatamentor: String,
    val descDatamentor: String
) : Parcelable
