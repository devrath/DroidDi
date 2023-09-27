package com.istudio.di.modules.dagger.demos.subcomponents.builder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerSubComponentsBinding
import com.istudio.di.databinding.ActivityDaggerSubComponentsBuilderBinding
import com.istudio.di.databinding.ActivityDaggerSubComponentsFactoryBinding

class DaggerSubComponentsBuilderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerSubComponentsBuilderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerSubComponentsBuilderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {

            }
        }
    }
}