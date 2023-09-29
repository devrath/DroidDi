package com.istudio.di.modules.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.databinding.ActivityHiltDemoBinding
import com.istudio.di.modules.hilt.demos.clientserver_demo.HiltClientServerActivity
import com.istudio.di.modules.hilt.demos.injection_demo.constructor_injection.HiltConstructorInjectionActivity
import com.istudio.di.modules.hilt.demos.injection_demo.field_injection.HiltFieldInjectionActivity
import com.istudio.di.modules.hilt.demos.injection_demo.interface_Injection.HiltInterfaceInjectionActivity
import com.istudio.di.modules.hilt.demos.qualifiers_demo.HiltQualifiersActivity
import com.istudio.di.utils.startActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HiltDemoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltDemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            hiltClientServerId.setOnClickListener { startActivity<HiltClientServerActivity>() }
            constructorInjectionId.setOnClickListener { startActivity<HiltConstructorInjectionActivity>() }
            fieldInjectionId.setOnClickListener { startActivity<HiltFieldInjectionActivity>() }
            interfaceInjectionId.setOnClickListener { startActivity<HiltInterfaceInjectionActivity>() }
            hiltQualifiersId.setOnClickListener { startActivity<HiltQualifiersActivity>() }
        }
    }
}