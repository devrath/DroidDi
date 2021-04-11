package com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.vehicleParts

import android.util.Log
import javax.inject.Inject


class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {
    private val TAG = "Dagger"
    fun drive() {
        Log.d(TAG, "Car is Driving")
    }
}