package com.istudio.di.modules.dagger.demos.scopes.customscope

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.istudio.di.DiApplication
import com.istudio.di.databinding.ActivityCustomScopeBinding
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingcomponent.DaggerNetworkComponent
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingmodule.ActivityComponent
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingmodule.DaggerActivityComponent
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.CustomRetrofit
import com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingmodule.ImageProcessingServiceModule
import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class CustomScopeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCustomScopeBinding

    private lateinit var component : ActivityComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomScopeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();

        component =  DaggerActivityComponent.builder()
            .applicationComponent((application as DiApplication).provideApplicationComponent())
            .imageProcessingServiceModule(ImageProcessingServiceModule())
            .build()

        testReferences();
    }

    private fun setOnClickListeners() {

        binding.apply {
            initiateUsingModuleId.setOnClickListener {
                testReferences()
            }
        }
    }

    private fun testReferences() {
        val analyticsService = component.provideAnalytics()
        val analyticsService1 = component.provideAnalytics()
        val imageService = component.provideImageProcessingService()
        val imageService1 = component.provideImageProcessingService()
        PrintUtils.printLog("analyticsService reference ->" + analyticsService.hashCode().toString())
        PrintUtils.printLog("analyticsService1 reference ->" + analyticsService1.hashCode().toString())
        PrintUtils.printLog("imageService reference ->" + imageService.hashCode().toString())
        PrintUtils.printLog("imageService1 reference ->" + imageService1.hashCode().toString())
        PrintUtils.printLog("Injected")
    }

}