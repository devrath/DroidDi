package com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.state

import com.istudio.di.modules.hilt.demos.clientserver.data.model.User

data class NetworkApiDemoUiState (
    val data: List<User> = emptyList(),
    val errorMessage: String = "",
    val isLoading: Boolean = false
)
