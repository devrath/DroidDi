package com.istudio.di.modules.hilt.demos.qualifiers_demo.implementations

import javax.inject.Inject

class AmericanCatImpl @Inject constructor(): Cat {
    override fun getName(): String {
        return "American Cat Running"
    }
}