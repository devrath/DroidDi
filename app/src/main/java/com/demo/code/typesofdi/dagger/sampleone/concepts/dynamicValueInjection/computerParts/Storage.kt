package com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.computerParts

import android.util.Log
import com.demo.code.typesofdi.dagger.selection.TAG_DAGGER

class Storage constructor(var sizeInGB : Int) {

    init {
        Log.d(TAG_DAGGER,"Storage Init is invoked")
    }

    fun initialize() {
        Log.d(TAG_DAGGER,"Storage member function is invoked"
            .plus(" :: ")
            .plus("Size of storage")
            .plus(" ")
            .plus(sizeInGB)
        )
    }

}