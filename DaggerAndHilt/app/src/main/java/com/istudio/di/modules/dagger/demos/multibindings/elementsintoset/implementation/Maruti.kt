package com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.implementation

import javax.inject.Inject

class Maruti @Inject constructor() : Car {
    override fun name(): String {
        return "Maruti ^-^ Output"
    }
}