package com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.vehicleParts

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import javax.inject.Inject

class SwiftDieselEngine @Inject constructor() : MarutiEngine {

    init {
        Log.d(TAG_HILT,"SwiftDieselEngine init is invoked")
    }

    override fun startEngine() {
        Log.d(TAG_HILT,"SwiftDieselEngine started")
    }

}