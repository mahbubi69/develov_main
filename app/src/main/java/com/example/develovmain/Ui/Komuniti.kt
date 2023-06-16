package com.example.develovmain.Ui

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize


data class Komuniti(
    val imgprofilKomuniti: Int,
    val nameprofilKomuniti: String,
    val judulpostKomuniti: String,
    val descpostKomuniti: String
)
