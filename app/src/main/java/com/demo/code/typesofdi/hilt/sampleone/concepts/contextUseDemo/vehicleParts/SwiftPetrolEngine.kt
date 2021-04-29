package com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.vehicleParts

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.vehicleParts.MarutiEngine
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import javax.inject.Inject

class SwiftPetrolEngine  @Inject constructor() {

    init {
        Log.d(TAG_HILT,"SwiftPetrolEngine init is invoked")
    }


}