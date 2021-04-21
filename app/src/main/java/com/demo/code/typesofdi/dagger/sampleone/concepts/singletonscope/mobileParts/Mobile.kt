package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.mobileParts

import android.util.Log
import javax.inject.Inject

class Mobile @Inject constructor(private var battery: Battery,private var screen: Screen){

    private val TAG = "Dagger"

    init {
        Log.d(TAG, "Mobile init block is invoked"
            .plus(" ")
            .plus("::")
            .plus(this)
        )
    }

    fun initialize(){

        battery.initialize()
        screen.initialize()

        Log.d(TAG, "Currently"
            .plus(" ")
            .plus("Mobile").plus(" :: ").plus(this).plus(" ")
            .plus("are using the components").plus(" ")
            .plus("Battery").plus(" :: ").plus(battery).plus(" ")
            .plus("Screen").plus(" :: ").plus(screen)
        )
    }

}