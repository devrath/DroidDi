package com.demo.code.ui.dagger.automobile.vehicleParts

import android.util.Log
import javax.inject.Inject

const val TAG = "Car"

class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {

    fun drive() {
        Log.d(TAG, "Car is Driving")
    }

}