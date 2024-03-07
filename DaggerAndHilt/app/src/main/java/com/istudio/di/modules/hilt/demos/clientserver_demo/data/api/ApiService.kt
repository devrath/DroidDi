package com.istudio.di.modules.hilt.demos.clientserver_demo.data.api

import com.istudio.di.modules.hilt.demos.clientserver_demo.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}