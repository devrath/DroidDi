package com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.vehicleParts

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT

class Car constructor(var engine: Engine) {
    init {
        Log.d(TAG_HILT,"Car init is invoked")
    }

    fun startCar() {
        engine.startEngine()
        Log.d(TAG_HILT,"Car has started")
    }
}