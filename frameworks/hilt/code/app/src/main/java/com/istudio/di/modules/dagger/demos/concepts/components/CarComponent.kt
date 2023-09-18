package com.istudio.di.modules.dagger.demos.concepts.components

import com.istudio.di.modules.dagger.demos.concepts.implementations.vehicle.Car
import dagger.Component

@Component
interface CarComponent {
    fun getCar() : Car
}