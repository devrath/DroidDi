package com.demo.code.typesofdi.hilt.sampleone.concepts.providesAnnotation.whatsappParts

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT

class Glide {
    init {
        Log.d(TAG_HILT,"Glide Init is invoked")
    }

    fun startGlide(){
        Log.d(TAG_HILT,"Glide Started")
    }
}