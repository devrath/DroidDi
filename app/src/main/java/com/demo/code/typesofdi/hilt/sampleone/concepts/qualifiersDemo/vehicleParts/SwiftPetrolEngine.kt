package com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.vehicleParts

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import javax.inject.Inject

class SwiftPetrolEngine  @Inject constructor() : MarutiEngine{

    init {
        Log.d(TAG_HILT,"SwiftPetrolEngine init is invoked")
    }

    override fun startEngine() {
        Log.d(TAG_HILT,"SwiftPetrolEngine started")
    }

}