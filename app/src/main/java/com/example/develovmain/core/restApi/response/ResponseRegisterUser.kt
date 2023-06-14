package com.example.develovmain.core.restApi.response

import com.google.gson.annotations.SerializedName

data class ResponseRegisterUser(
    @SerializedName("status") val status: Int, @SerializedName("message") val message: String
)
