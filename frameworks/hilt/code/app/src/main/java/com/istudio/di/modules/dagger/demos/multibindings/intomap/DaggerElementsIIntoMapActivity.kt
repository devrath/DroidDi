package com.istudio.di.modules.dagger.demos.multibindings.intomap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerElementsIntoMapBinding
import com.istudio.di.databinding.ActivityDaggerMultiBindingsSelectionBinding

class DaggerElementsIIntoMapActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerElementsIntoMapBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerElementsIntoMapBinding.inflate(layoutInflater)
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