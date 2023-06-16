package com.example.develovmain.core.restApi.model

import com.google.gson.annotations.SerializedName

data class LoginUserModel(
    @SerializedName("email") val email: String,
    @SerializedName("password") val password: String
)