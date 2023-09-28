package com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation

import javax.inject.Inject

class Samsung @Inject constructor() : Telivision {
    override fun name(): String {
        return "Samsung ^-^ Output"
    }
}