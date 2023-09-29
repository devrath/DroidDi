package com.istudio.di.modules.hilt.demos.clientserver_demo.presentation.compose.state

import com.istudio.di.modules.hilt.demos.clientserver_demo.data.model.User

data class NetworkApiDemoUiState (
    val data: List<User> = emptyList(),
    val errorMessage: String = "",
    val isLoading: Boolean = false
)
