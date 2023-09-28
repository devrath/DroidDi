package com.istudio.di.modules.hilt.demos.clientserver.data.repository

import com.istudio.di.modules.hilt.demos.clientserver.data.api.ApiService
import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import com.istudio.di.modules.hilt.demos.clientserver.domain.MainRepository
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import java.util.concurrent.Flow
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val apiHelper: ApiService
) : MainRepository {
    override suspend fun getUsers() = flow {
        emit(apiHelper.getUsers())
    }

}