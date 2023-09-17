package com.istudio.di.modules.hilt.demos.clientserver.presentation.state

import com.istudio.di.modules.hilt.demos.clientserver.data.model.User

sealed class NetworkApiDemoUiState {
    data class Data(val data: List<User>) : NetworkApiDemoUiState()
    data class Error(val message: String) : NetworkApiDemoUiState()
    data class Loading(val isLoading: Boolean) : NetworkApiDemoUiState()
}
