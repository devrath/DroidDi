package com.istudio.di.modules.hilt.demos.injection_demo.interface_Injection.implementation

import javax.inject.Inject

class JainismReligion @Inject constructor() : Religion {
    override fun getReligionName(): String {
        return "JainismReligion -> Printed"
    }
}