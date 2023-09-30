package com.istudio.di.modules.hilt.demos.multibinding_demo.elements_into_set_demo.implementations

import javax.inject.Inject

class Mars @Inject constructor() : Planet {
    override fun printInstance(name: String) {

    }
}