package com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.vm

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import com.istudio.di.modules.hilt.demos.clientserver.domain.MainRepository
import com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.state.NetworkApiDemoUiState
import com.istudio.di.modules.hilt.demos.clientserver.utils.NetworkHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HiltNetworkComposeApiVm @Inject constructor(
    private val mainRepositoryImpl: MainRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    var viewState by mutableStateOf(NetworkApiDemoUiState())
        private set

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            // Notify that UI is loading
            viewState = viewState.copy(isLoading = true)

            if (networkHelper.isNetworkConnected()) {
                viewModelScope.launch {
                    mainRepositoryImpl.getUsers()
                        .flowOn(Dispatchers.IO)
                        .catch { e ->
                            viewState = viewState.copy(errorMessage = e.message.toString())
                        }
                        .collect {
                            viewState = viewState.copy(data = it)
                        }
                }
            } else {
                viewState = viewState.copy(errorMessage = "No internet connection")
            }
        }
    }

}