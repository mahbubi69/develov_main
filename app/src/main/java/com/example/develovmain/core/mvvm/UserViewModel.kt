package com.example.develovmain.core.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.develovmain.core.repository.UserRepository
import com.example.develovmain.core.restApi.model.RegisterUserModel
import com.example.develovmain.core.restApi.response.ApiUserResponseFlow
import com.example.develovmain.core.restApi.response.ResponseRegisterUser
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val repository: UserRepository) : ViewModel() {
    fun registerUserViewModel(submitRegisterUser: RegisterUserModel): LiveData<ApiUserResponseFlow<ResponseRegisterUser>> =
        runBlocking {
            val regisJobs = async { repository.registerUserRepository(submitRegisterUser) }
            runBlocking {
                regisJobs.await().asLiveData()
            }
        }
}