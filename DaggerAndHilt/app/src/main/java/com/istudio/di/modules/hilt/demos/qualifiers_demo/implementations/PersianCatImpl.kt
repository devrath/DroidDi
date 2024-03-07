package com.istudio.di.modules.hilt.demos.qualifiers_demo.implementations

import javax.inject.Inject

class PersianCatImpl @Inject constructor() : Cat {
    override fun getName(): String {
        return "Persian Cat Running"
    }
}