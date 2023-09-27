package com.istudio.di.modules.dagger.demos.clientserver.presentation.xml.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.istudio.di.modules.dagger.demos.clientserver.domain.DaggerRepository
import com.istudio.di.modules.dagger.demos.clientserver.presentation.xml.state.NetworkDaggerApiDemoUiState
import com.istudio.di.modules.hilt.demos.clientserver.domain.MainRepository
import com.istudio.di.modules.hilt.demos.clientserver.presentation.xml.state.NetworkApiDemoUiState
import com.istudio.di.modules.hilt.demos.clientserver.utils.NetworkHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

class DaggerNetworkXmlApiVm @Inject constructor(
    private val mainRepositoryImpl: DaggerRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _state = MutableLiveData<NetworkDaggerApiDemoUiState>()
    val state : LiveData<NetworkDaggerApiDemoUiState> get() = _state


    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {

            // Notify that UI is loading
            _state.value = NetworkDaggerApiDemoUiState.Loading(isLoading = true)

            if (networkHelper.isNetworkConnected()) {
                viewModelScope.launch {
                    mainRepositoryImpl.getUsers()
                        .flowOn(Dispatchers.IO)
                        .catch { e ->
                            _state.value = NetworkDaggerApiDemoUiState.Error(message = "No internet connection")
                        }
                        .collect {
                            _state.value = NetworkDaggerApiDemoUiState.Data(data = it)
                        }
                }
            } else {
                _state.value = NetworkDaggerApiDemoUiState.Error(message = "No internet connection")
            }
        }
    }

}