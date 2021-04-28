package com.demo.code.typesofdi.hilt.sampleone.concepts.providesAnnotation.whatsappParts

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT

class Retrofit {
    init {
        Log.d(TAG_HILT,"Retrofit Init is invoked")
    }

    fun startRetrofit(){
        Log.d(TAG_HILT,"Retrofit Started")
    }
}