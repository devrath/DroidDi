package com.istudio.di.modules.dagger.demos.scopes.customscope

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.istudio.di.DiApplication
import com.istudio.di.databinding.ActivityCustomScopeBinding
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingcomponent.DaggerNetworkComponent
import com.istudio.di.modules.dagger.demos.scopes.customscope.components.usingmodule.DaggerActivityComponent
import com.istudio.di.modules.dagger.demos.scopes.customscope.implementations.usingcomponent.CustomRetrofit
import com.istudio.di.modules.dagger.demos.scopes.customscope.modules.usingmodule.ImageProcessingServiceModule
import com.istudio.di.utils.PrintUtils
import javax.inject.Inject

class CustomScopeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCustomScopeBinding

    @Inject lateinit var retrofit : CustomRetrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomScopeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {

        binding.apply {
            initiateUsingModuleId.setOnClickListener {

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

            initiateUsingComponentBuilderId.setOnClickListener {
                val component = DaggerNetworkComponent.factory()
                    .create((application as DiApplication).provideApplicationComponent())
                    .inject(this@CustomScopeActivity)
                PrintUtils.printLog("Injected")
                retrofit.initiateRetrofit()
                PrintUtils.printLog("Retrofit called")
            }
        }
    }

}