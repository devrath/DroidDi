package com.demo.code.typesofdi.hilt.sampleone.selection

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HiltConceptsSelectionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Hilt Fragment"
    }
    val text: LiveData<String> = _text
}