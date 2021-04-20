package com.demo.code.typesofdi.dagger.sampleone.concepts.dynamicValueInjection.computerParts

import android.util.Log
import com.demo.code.typesofdi.dagger.selection.TAG_DAGGER
import javax.inject.Inject

class Computer @Inject constructor(var ram :Ram, var storage: Storage){

    init {
        Log.d(TAG_DAGGER,"Computer Init is invoked")
    }

    fun initilize() {
        // Computer initialize is invoked
        Log.d(TAG_DAGGER,"Computer member function is invoked")
        // Ram initialize is invoked
        ram.initialize()
        // Storage initialize is invoked
        storage.initialize()
    }

}