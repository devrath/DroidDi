package com.istudio.di.modules.dagger.demos.multibindings.elementsintoset

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerMultiBindingElementsIntoSetBinding
import com.istudio.di.databinding.ActivityDaggerMultiBindingIntoSetBinding
import com.istudio.di.databinding.ActivityDaggerMultiBindingsSelectionBinding
import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.components.DaggerCarComponent
import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.implementation.Car
import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.implementation.Hyundai
import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.implementation.Maruti
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Lg
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Samsung
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Telivision
import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class DaggerMultiBindingElementsIntoSetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerMultiBindingElementsIntoSetBinding

    @Inject lateinit var car : Set<@JvmSuppressWildcards Car>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerMultiBindingElementsIntoSetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {

                val component = DaggerCarComponent.builder().build()
                component.inject(this@DaggerMultiBindingElementsIntoSetActivity)
                // Print the entire set
                PrintUtils.printLog(car.toString())
                car.forEach { c ->
                    if(c is Maruti){
                        // Access Maruti specific functionalities
                        PrintUtils.printLog(c.name())
                    }else if(c is Hyundai){
                        // Access hyundai specific functionalities
                        PrintUtils.printLog(c.name())
                    }
                }


            }
        }
    }
}