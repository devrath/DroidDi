package com.istudio.di.modules.hilt.demos.multibinding_demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.istudio.di.databinding.ActivityHiltMultiBindingsSelectionBinding
import com.istudio.di.modules.dagger.demos.multibindings.elementsintoset.implementation.Car
import com.istudio.di.modules.dagger.demos.multibindings.intomap.implementation.Pen
import com.istudio.di.modules.dagger.demos.multibindings.intoset.implementation.Telivision
import com.istudio.di.modules.hilt.demos.multibinding_demo.elements_into_set_demo.implementations.Planet
import com.istudio.di.modules.hilt.demos.multibinding_demo.into_map_demo.implementations.City
import com.istudio.di.modules.hilt.demos.multibinding_demo.into_set_demo.implementations.Country
import com.istudio.di.utils.PrintUtils
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltMultiBindingsSelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltMultiBindingsSelectionBinding
    // IntoMap
    @Inject lateinit var cities : Map<Class<*>,@JvmSuppressWildcards City>
    // ElementsIntoSet
    @Inject lateinit var countries : Set<@JvmSuppressWildcards Country>
    // IntoSet
    @Inject lateinit var planets : Set<@JvmSuppressWildcards Planet>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltMultiBindingsSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            intoMapId.setOnClickListener {
                // IntoMap
                cities.forEach { city ->
                    PrintUtils.printLog("<------------------------------------>")
                    PrintUtils.printLog("KEY:->"+city.key)
                    PrintUtils.printLog("VALUE:->"+city.value)
                    PrintUtils.printLog(city.hashCode().toString())
                    PrintUtils.printLog("<------------------------------------>")
                }
            }
            usingIntoSetId.setOnClickListener {
                // IntoSet
                planets.forEach { planet ->
                    PrintUtils.printLog("<------------------------------------>")
                    PrintUtils.printLog("PLANET INSTANCE:->${planet.hashCode()}")
                    PrintUtils.printLog("PLANET:-> $planet")
                    PrintUtils.printLog("<------------------------------------>")
                }
            }
            elementsIntoSetId.setOnClickListener {
                // ElementsIntoSet
                cities.forEach { city ->
                    PrintUtils.printLog("<------------------------------------>")
                    PrintUtils.printLog("KEY:->"+city.key)
                    PrintUtils.printLog("VALUE:->"+city.value)
                    PrintUtils.printLog(city.hashCode().toString())
                    PrintUtils.printLog("<------------------------------------>")
                }
            }
        }
    }
}