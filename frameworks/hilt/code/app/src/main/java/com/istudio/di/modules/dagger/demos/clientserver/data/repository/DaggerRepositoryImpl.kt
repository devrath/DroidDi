package com.istudio.di.modules.dagger.demos.clientserver.data.repository

import com.istudio.di.modules.dagger.demos.clientserver.data.api.DaggerApiService
import com.istudio.di.modules.dagger.demos.clientserver.data.model.DaggerUser
import com.istudio.di.modules.dagger.demos.clientserver.domain.DaggerRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class DaggerRepositoryImpl @Inject constructor(
    private val apiHelper: DaggerApiService
) : DaggerRepository{
    override suspend fun getUsers()= flow {
        emit(apiHelper.getUsers())
    }
}