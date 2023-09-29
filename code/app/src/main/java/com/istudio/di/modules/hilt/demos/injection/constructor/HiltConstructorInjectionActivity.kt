package com.istudio.di.modules.hilt.demos.injection.constructor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerMultiBindingIntoSetBinding
import com.istudio.di.databinding.ActivityHiltConstructorInjectionBinding

class HiltConstructorInjectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltConstructorInjectionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltConstructorInjectionBinding.inflate(layoutInflater)
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