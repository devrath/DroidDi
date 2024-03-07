package com.istudio.di.modules.hilt.demos.clientserver_demo.data.repository

import com.istudio.di.modules.hilt.demos.clientserver_demo.data.api.ApiService
import com.istudio.di.modules.hilt.demos.clientserver_demo.domain.MainRepository
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val apiHelper: ApiService
) : MainRepository {
    override suspend fun getUsers() = flow {
        emit(apiHelper.getUsers())
    }

}