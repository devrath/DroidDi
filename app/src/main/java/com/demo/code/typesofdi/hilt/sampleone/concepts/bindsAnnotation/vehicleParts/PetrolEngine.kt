package com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.vehicleParts

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine{

    init {
        Log.d(TAG_HILT,"PetrolEngine init is invoked")
    }

    override fun startEngine() {
        Log.d(TAG_HILT,"PetrolEngine has started")
    }
}