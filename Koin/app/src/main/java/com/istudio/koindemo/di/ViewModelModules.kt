package com.istudio.koindemo.di

import com.istudio.koindemo.main.MainViewModel
import com.istudio.koindemo.modules.module_demos.variable_injection.VariableInjectionVm
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModules = module {
    viewModelOf(::MainViewModel)
    viewModel { VariableInjectionVm(get()) }
}