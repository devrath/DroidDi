package com.istudio.di.modules.hilt.demos.injection_demo.field_injection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.databinding.ActivityHiltFieldInjectionBinding
import com.istudio.di.modules.hilt.demos.injection_demo.field_injection.implementation.Computer
import com.istudio.di.utils.PrintUtils
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class HiltFieldInjectionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltFieldInjectionBinding

    @Inject lateinit var computer: Computer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltFieldInjectionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {
                PrintUtils.printLog("Computer instance -> "+computer.hashCode().toString())
                computer.start()
            }
        }
    }
}