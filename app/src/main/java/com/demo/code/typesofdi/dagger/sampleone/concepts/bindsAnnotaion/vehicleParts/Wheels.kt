package com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.vehicleParts

import android.util.Log
import javax.inject.Inject

class Wheels @Inject constructor() {
    private val TAG = "Dagger"
    init {
        Log.d(TAG, "Wheel is constructed")
    }

    fun constructWheels(){
        Log.d(TAG, "Wheel method is invoked")
    }
}