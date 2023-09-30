package com.istudio.hilt_demo_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltMultiModuleScenarioActivity : AppCompatActivity() {

   // @Inject lateinit var phone : Phone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_multi_module_scenario_activity)
    }
}