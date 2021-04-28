package com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.vehicleParts

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine{
    init {
        Log.d(TAG_HILT,"DieselEngine init is invoked")
    }

    override fun startEngine() {
        Log.d(TAG_HILT,"DieselEngine has started")
    }
}