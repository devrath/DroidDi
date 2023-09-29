package com.istudio.di.modules.hilt.demos.clientserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityHiltClientServerBinding
import com.istudio.di.databinding.ActivityHiltDemoBinding
import com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.activity.HiltNetworkComposeApiActivity
import com.istudio.di.modules.hilt.demos.clientserver.presentation.xml.activity.HiltNetworkXmlApiActivity
import com.istudio.di.utils.startActivity

class HiltClientServerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltClientServerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltClientServerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }
    private fun setOnClickListeners() {
        binding.apply {
            hiltNetworkXmlApiDemoId.setOnClickListener { startActivity<HiltNetworkXmlApiActivity>() }
            hiltNetworkComposeApiDemoId.setOnClickListener { startActivity<HiltNetworkComposeApiActivity>() }
        }
    }
}