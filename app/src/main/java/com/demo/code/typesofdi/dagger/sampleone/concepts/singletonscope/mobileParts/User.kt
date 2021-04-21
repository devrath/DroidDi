package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class User @Inject constructor(private var mobile: Mobile) {

    private val TAG = "Dagger"

    init {
        Log.d(TAG, "User init block is invoked"
            .plus(" ")
            .plus("::")
            .plus(this)
        )
    }


    fun initialize(){

        mobile.initialize()

        Log.d(TAG, "Currently"
            .plus(" ")
            .plus("User").plus(" :: ").plus(this).plus(" ")
            .plus("is using the mobile").plus(" ").plus(mobile)
        )
    }

}