package com.demo.code.typesofdi.hilt.sampleone.concepts.providesAnnotation.whatsappParts

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT

class WhatsApp constructor(val retrofit: Retrofit,val glide: Glide){
    init {
        Log.d(TAG_HILT,"WhatsApp Init is invoked")
    }

    fun startWhatsApp(){
        retrofit.startRetrofit()
        glide.startGlide()
    }
}