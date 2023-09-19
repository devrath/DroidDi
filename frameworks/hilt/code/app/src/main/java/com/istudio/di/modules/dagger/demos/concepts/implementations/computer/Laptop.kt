package com.istudio.di.modules.dagger.demos.concepts.implementations.computer

import com.istudio.di.modules.dagger.demos.concepts.implementations.computer.screen.ComputerScreen
import com.istudio.di.utils.PrintUtils.printLog
import javax.inject.Inject

class Laptop @Inject constructor(
    var computerBattery: ComputerBattery,
    var computerScreen: ComputerScreen
){

    init {
        printLog("Laptop constructor is invoked !")
    }

    fun runLaptop() {
        printLog("Laptop is running -> " +  "uses <-> ${computerScreen.buildScreen()}" )
    }


}