package com.demo.code.typesofdi.dagger.sampleone.concepts.bindsAnnotaion.vehicleParts

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine{

    private val TAG = "Dagger"

    init {
        Log.d(TAG, "Petrol engine is constructed")
    }

    override fun startEngine() {
        Log.d(TAG, "Petrol engine is started")
    }

}