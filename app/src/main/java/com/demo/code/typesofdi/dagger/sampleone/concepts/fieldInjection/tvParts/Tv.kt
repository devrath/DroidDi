package com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.tvParts

import android.util.Log
import javax.inject.Inject

class Tv @Inject constructor(var thirdPartyMotor: ThirdPartyMotor) {
    private val TAG = "Dagger"

    init {
        Log.d(TAG, "Tv is constructed")
    }

    fun play() {
        Log.d(TAG, "Tv has turned on!")
    }

}