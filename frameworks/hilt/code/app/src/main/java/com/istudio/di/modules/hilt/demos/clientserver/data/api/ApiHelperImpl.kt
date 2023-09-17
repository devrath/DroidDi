package com.istudio.di.modules.hilt.demos.clientserver.data.api

import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {
    override suspend fun getUsers(): Response<List<User>> = apiService.getUsers()

}