package com.demo.code.typesofdi.dagger.sampleone.concepts.constructorInjection.phoneParts

import android.util.Log
import com.demo.code.typesofdi.dagger.selection.TAG_DAGGER
import javax.inject.Inject

class Phone @Inject constructor(private var battery:Battery,private var sdCard:SdCard) {

    init {
        Log.d(TAG_DAGGER,"Phone Init is invoked")
    }

    fun initialize(){
        Log.d(TAG_DAGGER,"Phone Initialize function is invoked")
    }

}