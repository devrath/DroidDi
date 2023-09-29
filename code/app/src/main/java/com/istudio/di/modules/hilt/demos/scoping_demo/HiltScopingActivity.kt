package com.istudio.di.modules.hilt.demos.scoping_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityHiltQualifiersBinding
import com.istudio.di.databinding.ActivityHiltScopingBinding
import com.istudio.di.modules.hilt.demos.scoping_demo.implementations.DownloaderService
import com.istudio.di.modules.hilt.demos.scoping_demo.implementations.HiltAnalyticsService
import com.istudio.di.modules.hilt.demos.scoping_demo.implementations.HiltNetworkService
import com.istudio.di.modules.hilt.demos.scoping_demo.implementations.ImageProcessingService
import com.istudio.di.modules.hilt.demos.scoping_demo.implementations.SerializationService
import com.istudio.di.utils.PrintUtils
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltScopingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltScopingBinding

    // Not a singleton
    @Inject lateinit var imageProcessingService : ImageProcessingService
    // Singleton without Singleton component
    @Inject lateinit var hiltAnalyticsService : HiltAnalyticsService
    // Singleton component without singleton annotation
    @Inject lateinit var hiltNetworkService : HiltNetworkService
    // Singleton component with singleton annotation
    @Inject lateinit var serializationService : SerializationService
    // Application component with activity scoped annotation
    @Inject lateinit var downloaderService : DownloaderService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltScopingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            notASingleTonId.setOnClickListener {
                // Not a singleton
                val code = imageProcessingService.hashCode().toString()
                imageProcessingService.processImage(code)
            }
            singletonWithoutComponentId.setOnClickListener {
                // Singleton without Singleton component
                val code = hiltAnalyticsService.hashCode().toString()
                hiltAnalyticsService.logAnalytics(code)
            }
            singletonCompWithoutSingletonAnnotationId.setOnClickListener {
                // Singleton component without singleton annotation
                val code = hiltNetworkService.hashCode().toString()
                hiltNetworkService.callNetworkEndPoint(code)
            }
            singletonCompWithSingletonAnnotationId.setOnClickListener {
                // Singleton component with singleton annotation
                val code = serializationService.hashCode().toString()
                serializationService.serializeData(code)
            }
            actScopedWithActivityAnnotationId.setOnClickListener {
                // Application component with activity scoped annotation
                val code = downloaderService.hashCode().toString()
                downloaderService.downloadData(code)
            }
        }
    }

}