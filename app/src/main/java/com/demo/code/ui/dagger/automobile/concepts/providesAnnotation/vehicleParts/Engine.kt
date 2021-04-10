package com.demo.code.ui.dagger.automobile.concepts.providesAnnotation.vehicleParts

import android.util.Log
import javax.inject.Inject

/**
 * Engine is a object which is annotated with @Inject
 * With this annotation Engine is made available for the dependency graph
 */
class Engine @Inject constructor() {
    private val TAG = "Dagger"
    init {
        Log.d(TAG, "Engine is constructed")
    }
}