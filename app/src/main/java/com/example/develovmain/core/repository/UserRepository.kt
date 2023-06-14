package com.example.develovmain.core.repository

import com.example.develovmain.core.restApi.UserService
import com.example.develovmain.core.restApi.model.RegisterUserModel
import com.example.develovmain.core.restApi.response.ApiUserResponseFlow
import com.example.develovmain.core.restApi.response.ResponseRegisterUser
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(private val userService: UserService) {
    suspend fun registerUserRepository(registerUserModel: RegisterUserModel): Flow<ApiUserResponseFlow<ResponseRegisterUser>> {
        return flow {
            emit(ApiUserResponseFlow.Loading())
            try {
                emit(ApiUserResponseFlow.Loading())
                val responseRegisterUser = userService.registerUser(registerUserModel)
                if (responseRegisterUser.status == 201) {
                    emit(ApiUserResponseFlow.Succes(responseRegisterUser))
                } else {
                    emit(ApiUserResponseFlow.Error(responseRegisterUser.message))
                }

            } catch (e: Exception) {
                emit(ApiUserResponseFlow.Error(e.toString()))
                Timber.e("$e")
                println(e)
            }
        }.flowOn(Dispatchers.IO)
    }
}