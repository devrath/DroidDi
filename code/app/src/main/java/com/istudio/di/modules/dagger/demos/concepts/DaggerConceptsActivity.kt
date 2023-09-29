package com.istudio.di.modules.dagger.demos.concepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.databinding.ActivityDaggerConceptsBinding
import com.istudio.di.modules.dagger.demos.concepts.components.car.DaggerCarComponent
import com.istudio.di.modules.dagger.demos.concepts.components.computer.DaggerLaptopComponent
import com.istudio.di.modules.dagger.demos.concepts.components.os.DaggerOsComponent
import com.istudio.di.modules.dagger.demos.concepts.components.service.DaggerMessageServiceComponent
import com.istudio.di.modules.dagger.demos.concepts.components.tvremote.DaggerMobileComponent
import com.istudio.di.modules.dagger.demos.concepts.components.tvremote.DaggerRemoteComponent
import com.istudio.di.modules.dagger.demos.concepts.components.watch.DaggerWatchComponent
import com.istudio.di.modules.dagger.demos.concepts.implementations.device.Mobile
import com.istudio.di.modules.dagger.demos.concepts.implementations.vehicle.Car
import com.istudio.di.modules.dagger.demos.concepts.modules.watch.WatchModule
import javax.inject.Inject

class DaggerConceptsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerConceptsBinding

    @Inject
    lateinit var mobile : Mobile

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerConceptsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.apply {
            // Constructor Injection
            constructorInjectionId.setOnClickListener {
                val car: Car = DaggerCarComponent.create().getCar()
                car.start()
            }
            // Field Injection
            fieldInjectionId.setOnClickListener {
                val mobileComponent = DaggerMobileComponent.builder().build()
                mobileComponent.inject(this@DaggerConceptsActivity)
                mobile.runMobile()
            }
            // Injecting Interface
            injectingInterfaceId.setOnClickListener {
                val laptopComponent = DaggerLaptopComponent.create().getLaptop()
                laptopComponent.runLaptop()
            }
            // Injecting third party classes
            injectingThirdPartyId.setOnClickListener {
                val samsungMobileComponent = DaggerRemoteComponent.create().getMobile()
                samsungMobileComponent.runMobile()
            }
            // Injecting values at runtime - Using module
            injectValAtRuntimeId.setOnClickListener {
                val comp = DaggerWatchComponent.builder().watchModule(WatchModule(20)).build()
                comp.getWatch().buildWatch()
            }
            // Injecting values at runtime - Using Component
            injectValAtRuntimeComponentFactoryId.setOnClickListener {
                val comp = DaggerMessageServiceComponent
                    .factory().create("Pikachu").getMainService()
                comp.initiateAction()
            }
            // Using Qualifiers
            usingQualifiersId.setOnClickListener {
                val comp = DaggerOsComponent.create().getMobileOs()
                comp.displayOSType()
            }

        }
    }


}