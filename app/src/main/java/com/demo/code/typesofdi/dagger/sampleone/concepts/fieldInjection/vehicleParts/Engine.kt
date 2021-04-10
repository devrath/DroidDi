package com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.vehicleParts

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