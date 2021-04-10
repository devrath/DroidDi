package com.demo.code.typesofdi.koin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KoinSelectionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is koin Fragment"
    }
    val text: LiveData<String> = _text
}