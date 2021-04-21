package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(battery: Battery, screen: Screen){

    private val TAG = "Dagger"

    init {
        Log.d(TAG, "Mobile init block is invoked")
    }

    fun initilize(){

    }

}