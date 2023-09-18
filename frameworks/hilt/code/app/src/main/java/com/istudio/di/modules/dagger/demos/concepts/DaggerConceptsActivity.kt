package com.istudio.di.modules.dagger.demos.concepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.databinding.ActivityDaggerConceptsBinding
import com.istudio.di.modules.dagger.demos.concepts.components.DaggerCarComponent
import com.istudio.di.modules.dagger.demos.concepts.components.DaggerMobileComponent
import com.istudio.di.modules.dagger.demos.concepts.implementations.device.Mobile
import com.istudio.di.modules.dagger.demos.concepts.implementations.vehicle.Car
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
        }
    }


}