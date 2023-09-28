package com.istudio.di.modules.hilt.demos.clientserver.domain

import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

interface MainRepository {
    suspend fun getUsers(): Flow<List<User>>
}