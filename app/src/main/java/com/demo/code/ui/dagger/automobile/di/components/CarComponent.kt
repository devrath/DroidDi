package com.demo.code.ui.dagger.automobile.di.components

import com.demo.code.ui.dagger.automobile.vehicleParts.Car
import dagger.Component

/**
 * Component is the backbone of dagger - >
 * The component of dagger generates something called the dependency graph
 * The dependency graph is unidirectional - meaning there is no cyclic interdependency among them
 * **************************
 * The annotation is something that turns a class into usable code
 */
@Component
interface CarComponent {

    /**
     * Return type: It is the Class object we are trying to build
     * Name of the function is not important but it makes sense to have something meaningful.
     * **************************
     * We don't have to specify how to build this class, because dagger does this for us
     */
    fun getCar() : Car

}