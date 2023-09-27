package com.istudio.di.modules.dagger.demos.clientserver.domain

import com.istudio.di.modules.dagger.demos.clientserver.data.model.DaggerUser
import kotlinx.coroutines.flow.Flow

interface DaggerRepository {
    suspend fun getUsers(): Flow<List<DaggerUser>>
}