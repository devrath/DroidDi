package com.istudio.di.modules.hilt.demos.clientserver.data.api

import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}