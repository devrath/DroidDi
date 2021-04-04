package com.demo.code.ui.dagger.automobile.vehicleParts

import android.util.Log
import javax.inject.Inject

const val TAG = "Car"

/**
 * Car object - requires two parameters Engine and Wheels
 * There is constructor injection which is injecting 2 objects
 * Car object consumes Engine and Wheels
 * ******************
 * Car is having the dependency on two objects Engine and Wheels
 */
class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {

    fun drive() {
        Log.d(TAG, "Car is Driving")
    }

}