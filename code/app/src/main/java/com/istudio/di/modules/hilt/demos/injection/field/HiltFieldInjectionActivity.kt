package com.istudio.di.modules.hilt.demos.injection.field

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityHiltConstructorInjectionBinding
import com.istudio.di.databinding.ActivityHiltFieldInjectionBinding

class HiltFieldInjectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltFieldInjectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltFieldInjectionBinding.inflate(layoutInflater)
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