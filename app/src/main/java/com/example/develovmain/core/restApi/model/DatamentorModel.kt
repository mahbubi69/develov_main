package com.example.develovmain.core.restApi.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DatamentorModel(
    val imgDatamentor: Int,
    val nameDatamentor: String,
    val descDatamentor: String
) : Parcelable
