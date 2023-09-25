package com.istudio.di.modules.dagger.demos.scopes.applicationscope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.DiApplication
import com.istudio.di.R
import com.istudio.di.databinding.ActivityApplicationScopeBinding
import com.istudio.di.databinding.ActivityDaggerDemoSelectionBinding

class ApplicationScopeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityApplicationScopeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityApplicationScopeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        binding.apply {
            initiateId.setOnClickListener {
                val connComp1 = (application as DiApplication).provideHttpConnection()
                println(connComp1)
            }
        }
    }


}