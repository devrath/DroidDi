package com.istudio.di.modules.hilt.demos.clientserver.data.repository

import com.istudio.di.modules.hilt.demos.clientserver.data.api.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getUsers() =  apiHelper.getUsers()

}