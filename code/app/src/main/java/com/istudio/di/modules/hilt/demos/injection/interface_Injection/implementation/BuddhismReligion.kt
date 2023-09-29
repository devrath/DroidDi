package com.istudio.di.modules.hilt.demos.injection.interface_Injection.implementation

import javax.inject.Inject

class BuddhismReligion @Inject constructor() : Religion {
    override fun getReligionName(): String {
        return "BuddhismReligion -> Printed"
    }
}