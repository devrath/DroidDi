package com.demo.code.typesofdi.hilt.sampleone.concepts.constructorFieldInjection.di

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import javax.inject.Inject

class Charger @Inject constructor(var battery: Battery) {
    init {
        Log.d(TAG_HILT,"Charger Init is invoked")
    }
}