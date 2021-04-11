package com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.tvParts

import android.content.ContentValues.TAG
import android.util.Log
import com.demo.code.typesofdi.dagger.sampleone.concepts.providesAnnotation.vehicleParts.Engine
import javax.inject.Inject

class Tv @Inject constructor(var thirdPartyMotor: ThirdPartyMotor) {
    private val TAG = "Dagger"
    fun play() {
        Log.d(TAG, "Tv has turned on!")
    }

}