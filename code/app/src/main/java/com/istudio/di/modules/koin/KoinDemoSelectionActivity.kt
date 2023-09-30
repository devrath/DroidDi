package com.istudio.di.modules.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerDemoSelectionBinding
import com.istudio.di.databinding.ActivityKoinDemoSelectionBinding

class KoinDemoSelectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityKoinDemoSelectionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKoinDemoSelectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {

        }
    }
}