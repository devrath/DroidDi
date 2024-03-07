package com.istudio.di.modules.hilt.demos.injection_demo.constructor_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.databinding.ActivityHiltConstructorInjectionBinding
import com.istudio.di.modules.hilt.demos.injection_demo.constructor_injection.implementation.Car
import com.istudio.di.utils.PrintUtils
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltConstructorInjectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltConstructorInjectionBinding

    @Inject lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltConstructorInjectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {
                PrintUtils.printLog("Car instance -> "+car.hashCode().toString())
                car.start()
            }
        }
    }

}