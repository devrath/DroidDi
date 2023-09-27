package com.istudio.di.modules.dagger.demos.clientserver.data.model

import com.squareup.moshi.Json

data class DaggerUser(
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "avatar")
    val avatar: String = ""
)