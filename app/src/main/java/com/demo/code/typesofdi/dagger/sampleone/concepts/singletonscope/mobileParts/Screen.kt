package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts

import android.util.Log

class Screen {

    private val TAG = "Dagger"

    init {
        Log.d(TAG, "Screen init block is invoked"
            .plus(" ")
            .plus("::")
            .plus(this)
        )
    }

    fun initialize(){
        Log.d(TAG, "Currently"
            .plus(" ")
            .plus("Screen").plus(" :: ").plus("used is").plus(" ").plus(this)
        )
    }

}