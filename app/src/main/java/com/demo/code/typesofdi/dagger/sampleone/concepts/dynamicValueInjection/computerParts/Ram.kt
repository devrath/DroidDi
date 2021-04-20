package com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.computerParts

import android.util.Log
import com.demo.code.typesofdi.dagger.selection.TAG_DAGGER

class Ram constructor(isTwoGbRam : Boolean) {

    init {
        Log.d(TAG_DAGGER,"Ram Init is invoked")
    }

    fun initilize() {
        Log.d(TAG_DAGGER,"Ram member function is invoked")
    }

}