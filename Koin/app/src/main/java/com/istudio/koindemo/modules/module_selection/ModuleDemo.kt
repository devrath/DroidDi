package com.istudio.koindemo.modules.module_selection
sealed class ModuleDemo(val rout: String) {
    data object DemoSelection : ModuleDemo("DemoSelection")
    data object VariableInjection : ModuleDemo("VariableInjection")
}