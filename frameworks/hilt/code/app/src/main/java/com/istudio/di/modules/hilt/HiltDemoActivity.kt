package com.istudio.di.modules.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.R

class HiltDemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_demo)
    }
}