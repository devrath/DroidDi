package com.istudio.di.modules.hilt.demos.injection.field

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.databinding.ActivityHiltFieldInjectionBinding
import com.istudio.di.modules.hilt.demos.injection.field.implementation.Computer
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
                println(computer.start())
            }
        }
    }
}