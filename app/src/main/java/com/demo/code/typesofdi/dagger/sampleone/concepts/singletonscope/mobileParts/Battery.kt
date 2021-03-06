package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts

import android.util.Log

class Battery {

    private val TAG = "Dagger"

    init {
        Log.d(TAG, "Battery init block is invoked"
            .plus(" ")
            .plus("::")
            .plus(this)
        )
    }

    fun initialize(){
        Log.d(TAG, "Currently"
            .plus(" ")
            .plus("Battery").plus(" :: ").plus("used is").plus(" ").plus(this)
        )
    }

}