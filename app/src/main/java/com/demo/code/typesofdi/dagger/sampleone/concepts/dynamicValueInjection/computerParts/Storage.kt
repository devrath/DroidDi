package com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.computerParts

import android.util.Log
import com.demo.code.typesofdi.dagger.selection.TAG_DAGGER

class Storage constructor(sizeInGB : Int) {

    init {
        Log.d(TAG_DAGGER,"Storage Init is invoked")
    }

    fun initilize() {
        Log.d(TAG_DAGGER,"Storage member function is invoked")
    }

}