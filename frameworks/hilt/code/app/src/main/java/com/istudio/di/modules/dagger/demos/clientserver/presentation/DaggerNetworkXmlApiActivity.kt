package com.istudio.di.modules.dagger.demos.clientserver.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerDemoSelectionBinding
import com.istudio.di.databinding.ActivityDaggerNetworkXmlApiBinding

class DaggerNetworkXmlApiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerNetworkXmlApiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerNetworkXmlApiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {

        }
    }
}