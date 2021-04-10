package com.demo.code.ui.dagger.automobile.concepts.bindsAnnotaion.vehicleParts

import android.util.Log
import javax.inject.Inject

/**
 * Wheels is a object which is annotated with @Inject
 * With this annotation Wheels is made available for the dependency graph
 */
class Wheels @Inject constructor() {
    private val TAG = "Dagger"
    init {
        Log.d(TAG, "Wheel is constructed")
    }
}