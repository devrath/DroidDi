package com.demo.code.typesOfDi.dagger.automobile.concepts.bindsAnnotaion.vehicleParts

import android.util.Log
import com.demo.code.typesOfDi.dagger.automobile.concepts.providesAnnotation.vehicleParts.Engine
import javax.inject.Inject

/**
 * Car object - requires two parameters Engine and Wheels
 * There is constructor injection which is injecting 2 objects
 * Car object consumes Engine and Wheels
 * ******************
 * Car is having the dependency on two objects Engine and Wheels
 */
class Car @Inject constructor(var engine: Engine, var wheels: Wheels) {
    private val TAG = "Dagger"
    fun drive() {
        Log.d(TAG, "Car is Driving")
    }
}