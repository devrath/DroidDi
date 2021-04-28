package com.demo.code.typesofdi.hilt.sampleone.concepts.constructorFieldInjection.di

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import javax.inject.Inject

class Capasitor @Inject constructor() {
    init {
        Log.d(TAG_HILT,"Capasitor Init is invoked")
    }
}