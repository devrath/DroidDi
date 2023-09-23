package com.istudio.di.modules.dagger.demos.concepts.components.computer

import com.istudio.di.modules.dagger.demos.concepts.implementations.computer.Laptop
import com.istudio.di.modules.dagger.demos.concepts.modules.computer.LcdScreenModule
import dagger.Component

@Component(modules = [LcdScreenModule::class])
interface LaptopComponent {
    fun getLaptop() : Laptop

}