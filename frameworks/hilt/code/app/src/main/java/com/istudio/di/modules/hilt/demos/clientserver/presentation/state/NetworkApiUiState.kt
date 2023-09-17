package com.istudio.di.modules.hilt.demos.clientserver.presentation.state

import com.istudio.di.modules.hilt.demos.clientserver.data.model.User

data class NetworkApiUiState (
    val data: List<User> = emptyList(),
    val errorMessage: String = "false",
)
