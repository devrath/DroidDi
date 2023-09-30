package com.istudio.hilt_demo_module

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class HiltMultiModuleScenarioActivity : AppCompatActivity() {

   // @Inject lateinit var religion : Phone


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt_multi_module_scenario_activity)
    }
}