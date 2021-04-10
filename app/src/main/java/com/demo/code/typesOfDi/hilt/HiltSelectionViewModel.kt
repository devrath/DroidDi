package com.demo.code.typesOfDi.hilt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HiltSelectionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Hilt Fragment"
    }
    val text: LiveData<String> = _text
}