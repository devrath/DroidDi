package com.istudio.di.modules.dagger.demos.clientserver.presentation.xml.state

import com.istudio.di.modules.dagger.demos.clientserver.data.model.DaggerUser

sealed class NetworkDaggerApiDemoUiState {
    data class Data(val data: List<DaggerUser>) : NetworkDaggerApiDemoUiState()
    data class Error(val message: String) : NetworkDaggerApiDemoUiState()
    data class Loading(val isLoading: Boolean) : NetworkDaggerApiDemoUiState()
}
