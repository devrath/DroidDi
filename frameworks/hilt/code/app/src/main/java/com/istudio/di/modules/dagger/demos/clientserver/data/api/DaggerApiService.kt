package com.istudio.di.modules.dagger.demos.clientserver.data.api

import com.istudio.di.modules.dagger.demos.clientserver.data.model.DaggerUser
import retrofit2.http.GET

interface DaggerApiService {
    @GET("users")
    suspend fun getUsers(): List<DaggerUser>
}