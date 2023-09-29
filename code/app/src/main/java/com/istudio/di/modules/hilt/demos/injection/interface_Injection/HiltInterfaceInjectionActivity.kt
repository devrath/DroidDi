package com.istudio.di.modules.hilt.demos.injection.interface_Injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.databinding.ActivityHiltInterfaceInjectionBinding
import com.istudio.di.modules.hilt.demos.injection.interface_Injection.implementation.Religion
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltInterfaceInjectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltInterfaceInjectionBinding

    @Inject lateinit var religion : Religion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltInterfaceInjectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {
                println(religion.getReligionName())
            }
        }
    }

}