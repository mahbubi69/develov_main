package com.example.develovmain.core.restApi.response


sealed class ApiUserResponseFlow<out R> {
    class Loading<T>() : ApiUserResponseFlow<T>()
    data class Succes<out T>(val data: T) : ApiUserResponseFlow<T>()
    data class Error(val errorMessage: String) : ApiUserResponseFlow<Nothing>()
}
