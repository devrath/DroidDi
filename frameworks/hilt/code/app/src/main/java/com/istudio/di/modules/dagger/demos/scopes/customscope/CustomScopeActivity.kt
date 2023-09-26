package com.istudio.di.modules.dagger.demos.scopes.customscope

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.istudio.di.DiApplication
import com.istudio.di.databinding.ActivityCustomScopeBinding
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.DaggerActivityComponent
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.DaggerApplicationComponent
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.AnalyticsService
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.ImageProcessingService
import com.istudio.di.modules.dagger.demos.scopes.customscope.modules.ImageProcessingServiceModule
import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class CustomScopeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCustomScopeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomScopeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {

        binding.apply {
            initiateId.setOnClickListener {

                val component =  DaggerActivityComponent.builder()
                    .applicationComponent((application as DiApplication).provideApplicationComponent())
                    .imageProcessingServiceModule(ImageProcessingServiceModule())
                    .build()

                val analyticsService = component.provideAnalytics()
                val analyticsService1 = component.provideAnalytics()
                val imageService = component.provideImageProcessingService()
                val imageService1 = component.provideImageProcessingService()

                PrintUtils.printLog("Injected")
            }
        }
    }

}