package com.demo.code.typesofdi.hilt.sampleone.concepts.constructorFieldInjection.di

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import javax.inject.Inject

class MicroOven @Inject constructor(var charger: Charger,var capasitor: Capasitor) {

    init {
        Log.d(TAG_HILT,"MicroOven Init is invoked")
    }

    fun startOven() {
        Log.d(TAG_HILT,"Micro oven is running")
    }

}