package com.istudio.di.modules.hilt.demos.clientserver.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import com.istudio.di.databinding.ActivityHiltDemoBinding
import com.istudio.di.databinding.ActivityHiltNetworkApiBinding

class HiltNetworkApiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltNetworkApiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltNetworkApiBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}