package com.istudio.koindemo.modules.module_demos.variable_injection

import androidx.lifecycle.ViewModel
import com.istudio.koindemo.service.hello_service.HelloService


class VariableInjectionVm(
    private val helloService: HelloService
) : ViewModel() {


    fun demo(): String {
        return helloService.doSomething()
    }


}