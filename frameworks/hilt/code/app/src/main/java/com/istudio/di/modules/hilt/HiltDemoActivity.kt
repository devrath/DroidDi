package com.istudio.di.modules.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityHiltDemoBinding
import com.istudio.di.databinding.ActivityHiltNetworkApiBinding
import com.istudio.di.modules.hilt.demos.clientserver.ui.HiltNetworkApiActivity
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
            hiltNetworkApiDemiId.setOnClickListener { startActivity<HiltNetworkApiActivity>() }
        }
    }
}