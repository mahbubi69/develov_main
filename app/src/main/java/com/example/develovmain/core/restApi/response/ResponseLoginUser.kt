package com.example.develovmain.core.restApi.response

import com.google.gson.annotations.SerializedName

data class ResponseLoginUser(
    @SerializedName("message") val message: String,
    @SerializedName("status") val status: Int,
    @SerializedName("token") val token: String
    )