package com.demo.code.typesofdi.dagger.selection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DaggerSelectionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Dagger Fragment"
    }
    val text: LiveData<String> = _text
}