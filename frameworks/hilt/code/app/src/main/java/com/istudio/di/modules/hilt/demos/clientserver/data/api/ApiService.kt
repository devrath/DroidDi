package com.istudio.di.modules.hilt.demos.clientserver.data.api

import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}