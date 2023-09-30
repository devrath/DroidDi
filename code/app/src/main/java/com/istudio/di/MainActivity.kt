package com.istudio.di

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.databinding.ActivityMainBinding
import com.istudio.di.modules.dagger.DaggerDemoSelectionActivity
import com.istudio.di.modules.hilt.HiltDemoActivity
import com.istudio.di.modules.koin.KoinDemoSelectionActivity
import com.istudio.di.utils.startActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            hiltId.setOnClickListener { startActivity<HiltDemoActivity>() }
            daggerId.setOnClickListener { startActivity<DaggerDemoSelectionActivity>() }
            koinId.setOnClickListener { startActivity<KoinDemoSelectionActivity>() }
        }
    }

}