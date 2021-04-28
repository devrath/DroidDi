package com.demo.code.typesofdi.hilt.sampleone.concepts.constructorFieldInjection.di

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import javax.inject.Inject

class Battery @Inject constructor() {
    init {
        Log.d(TAG_HILT,"Battery Init is invoked")
    }
}