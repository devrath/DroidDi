package com.demo.code.ui.dagger.automobile.di.components

import com.demo.code.ui.dagger.automobile.vehicleParts.Car
import com.demo.code.ui.dagger.automobile.view.AutomobileFragment
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
   fun inject(atomobileFragment : AutomobileFragment)
}