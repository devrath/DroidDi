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
    // IntoSet
    @Inject lateinit var countries : Set<@JvmSuppressWildcards Country>
    // ElementsIntoSet
    @Inject lateinit var planets : Set<@JvmSuppressWildcards Planet>
    // IntoMap
    @Inject lateinit var cities : Map<Class<*>,@JvmSuppressWildcards City>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltMultiBindingsSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            usingIntoSetId.setOnClickListener {
                // IntoSet
                countries.forEach { country ->
                    PrintUtils.printLog("<------------------------------------>")
                    PrintUtils.printLog(country.hashCode().toString())
                    PrintUtils.printLog("COUNTRY INSTANCE:->${country.hashCode()}")
                    PrintUtils.printLog("COUNTRY:-> $country")
                    PrintUtils.printLog("<------------------------------------>")
                }
            }
            elementsIntoSetId.setOnClickListener {
                // ElementsIntoSet
                planets.forEach { planet ->
                    PrintUtils.printLog("<------------------------------------>")
                    PrintUtils.printLog("PLANET INSTANCE:->${planet.hashCode()}")
                    PrintUtils.printLog("PLANET:-> $planet")
                    PrintUtils.printLog("<------------------------------------>")
                }
            }
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
        }
    }
}