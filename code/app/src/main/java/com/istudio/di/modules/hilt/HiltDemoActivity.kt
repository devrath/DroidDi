package com.istudio.di.modules.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.databinding.ActivityHiltDemoBinding
import com.istudio.di.modules.hilt.demos.clientserver.HiltClientServerActivity
import com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.activity.HiltNetworkComposeApiActivity
import com.istudio.di.modules.hilt.demos.clientserver.presentation.xml.activity.HiltNetworkXmlApiActivity
import com.istudio.di.modules.hilt.demos.injection.constructor.HiltConstructorInjectionActivity
import com.istudio.di.modules.hilt.demos.injection.field.HiltFieldInjectionActivity
import com.istudio.di.modules.hilt.demos.injection.interfaceInject.HiltInterfaceInjectionActivity
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
        }
    }
}