package com.example.develovmain.core.restApi


import com.example.develovmain.core.restApi.model.RegisterUserModel
import com.example.develovmain.core.restApi.response.ResponseRegisterUser
import retrofit2.http.*

interface UserService {
    //register
    @POST("register")
    suspend fun registerUser(
        @Body submitRegister: RegisterUserModel,
    ): ResponseRegisterUser

}