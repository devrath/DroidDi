package com.istudio.di.modules.dagger.demos.subcomponents.factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerSubComponentsBinding
import com.istudio.di.databinding.ActivityDaggerSubComponentsFactoryBinding

class DaggerSubComponentsFactoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerSubComponentsFactoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerSubComponentsFactoryBinding.inflate(layoutInflater)
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