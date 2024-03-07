package com.istudio.di.modules.hilt.demos.clientserver_demo.presentation.xml.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.istudio.di.modules.hilt.demos.clientserver_demo.domain.MainRepository
import com.istudio.di.modules.hilt.demos.clientserver_demo.presentation.xml.state.NetworkApiDemoUiState
import com.istudio.di.modules.hilt.demos.clientserver_demo.utils.NetworkHelper
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HiltNetworkXmlApiVm @Inject constructor(
    private val mainRepositoryImpl: MainRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _state = MutableLiveData<NetworkApiDemoUiState>()
    val state : LiveData<NetworkApiDemoUiState> get() = _state


    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {

            // Notify that UI is loading
            _state.value = NetworkApiDemoUiState.Loading(isLoading = true)

            if (networkHelper.isNetworkConnected()) {
                viewModelScope.launch {
                    mainRepositoryImpl.getUsers()
                        .flowOn(Dispatchers.IO)
                        .catch { e ->
                            _state.value = NetworkApiDemoUiState.Error(message = "No internet connection")
                        }
                        .collect {
                            _state.value = NetworkApiDemoUiState.Data(data = it)
                        }
                }
            } else {
                _state.value = NetworkApiDemoUiState.Error(message = "No internet connection")
            }
        }
    }

}