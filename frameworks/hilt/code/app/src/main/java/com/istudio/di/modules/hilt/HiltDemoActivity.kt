package com.istudio.di.modules.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HiltDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_demo)
    }

}