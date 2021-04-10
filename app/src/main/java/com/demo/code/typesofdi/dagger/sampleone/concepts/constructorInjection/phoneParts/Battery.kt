package com.demo.code.typesofdi.dagger.sampleone.concepts.constructorInjection.phoneParts

import android.util.Log
import com.demo.code.typesofdi.dagger.selection.TAG_DAGGER
import javax.inject.Inject

class Battery @Inject constructor() {
    init {
        Log.d(TAG_DAGGER,"Battery Init is invoked")
    }

    fun initialize(){
        Log.d(TAG_DAGGER,"Battery Initialize function is invoked")
    }
}