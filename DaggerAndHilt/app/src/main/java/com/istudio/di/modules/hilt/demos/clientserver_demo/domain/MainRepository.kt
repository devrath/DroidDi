package com.istudio.di.modules.hilt.demos.clientserver_demo.domain

import com.istudio.di.modules.hilt.demos.clientserver_demo.data.model.User
import kotlinx.coroutines.flow.Flow

interface MainRepository {
    suspend fun getUsers(): Flow<List<User>>
}