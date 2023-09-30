package com.istudio.di.modules.hilt.demos.multimodule_demo.implementations

import javax.inject.Inject

class RealMe @Inject constructor() : Phone{
    override fun getPhoneName(name: String) {

    }
}