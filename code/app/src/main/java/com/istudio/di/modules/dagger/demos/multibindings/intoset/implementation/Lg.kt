package com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation

import javax.inject.Inject

class Lg @Inject constructor() : Telivision {
    override fun name(): String {
        return "Lg ^-^ Output"
    }
}