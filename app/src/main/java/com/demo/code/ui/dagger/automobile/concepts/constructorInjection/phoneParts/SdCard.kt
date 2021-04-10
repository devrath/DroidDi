package com.demo.code.ui.dagger.automobile.concepts.constructorInjection.phoneParts

import android.util.Log
import com.demo.code.ui.dagger.selection.TAG_DAGGER
import javax.inject.Inject

class SdCard @Inject constructor() {
    init {
        Log.d(TAG_DAGGER,"SdCard Init is invoked")
    }

    fun initialize(){
        Log.d(TAG_DAGGER,"SdCard Initialize function is invoked")
    }
}