package com.istudio.di.modules.dagger.demos.multibindings.intomap.implementation

import javax.inject.Inject

class Ballpen @Inject constructor() : Pen {
    override fun name(): String {
        return "Ballpen ^-^ Output"
    }
}