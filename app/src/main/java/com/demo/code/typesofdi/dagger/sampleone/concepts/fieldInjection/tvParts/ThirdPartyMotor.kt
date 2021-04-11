package com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.tvParts

import android.util.Log
import javax.inject.Inject

class ThirdPartyMotor constructor(var thirdPartyCapacitor: ThirdPartyCapacitor) {
    private val TAG = "Dagger"
    init {
        Log.d(TAG, "ThirdPartyMotor is running")
    }
}