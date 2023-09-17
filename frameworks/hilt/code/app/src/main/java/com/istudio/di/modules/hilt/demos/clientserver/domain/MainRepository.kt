package com.istudio.di.modules.hilt.demos.clientserver.domain

import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import retrofit2.Response

interface MainRepository {
    suspend fun getUsers(): Response<List<User>>
}