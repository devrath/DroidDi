package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts

import android.util.Log
import javax.inject.Inject

class User @Inject constructor(mobile: Mobile) {

    private val TAG = "Dagger"

    init {
        Log.d(TAG, "Screen init block is invoked")
    }


    fun initilize(){

    }

}