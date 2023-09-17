package com.istudio.di.modules.hilt.demos.clientserver.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import com.istudio.di.modules.hilt.demos.clientserver.data.repository.MainRepositoryImpl
import com.istudio.di.modules.hilt.demos.clientserver.domain.MainRepository
import com.istudio.di.modules.hilt.demos.clientserver.utils.NetworkHelper
import com.istudio.di.modules.hilt.demos.clientserver.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HiltNetworkApiVm @Inject constructor(
    private val mainRepositoryImpl: MainRepository,
    private val networkHelper: NetworkHelper
) : ViewModel() {

    private val _users = MutableLiveData<Resource<List<User>>>()
    val users: LiveData<Resource<List<User>>>
        get() = _users

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            _users.postValue(Resource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                viewModelScope.launch {
                    mainRepositoryImpl.getUsers()
                        .flowOn(Dispatchers.IO)
                        .catch { e ->
                            _users.postValue(Resource.error(e.message.toString(), null))
                        }
                        .collect {
                            _users.postValue(Resource.success(it))
                        }
                }
            } else _users.postValue(Resource.error("No internet connection", null))
        }
    }

}