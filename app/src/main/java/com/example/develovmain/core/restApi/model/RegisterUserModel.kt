package com.example.develovmain.core.restApi.model

import com.google.gson.annotations.SerializedName

data class RegisterUserModel(
    @SerializedName("nama") val nama: String,
    //(username) not camel case noted (mahbubi)
    @SerializedName("username") val userName: String,
    @SerializedName("email") val email: String,
    @SerializedName("noHp") val noHp: String,
    @SerializedName("password") val password: String,
    @SerializedName("purpose") val purpose: String,
    @SerializedName("role") val role: Int,
)