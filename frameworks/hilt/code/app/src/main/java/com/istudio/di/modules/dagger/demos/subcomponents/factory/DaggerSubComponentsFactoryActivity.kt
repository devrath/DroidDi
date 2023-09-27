package com.istudio.di.modules.dagger.demos.subcomponents.factory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.DiApplication
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerSubComponentsBinding
import com.istudio.di.databinding.ActivityDaggerSubComponentsFactoryBinding
import com.istudio.di.modules.dagger.demos.subcomponents.factory.implementations.phone.Phone
import javax.inject.Inject

class DaggerSubComponentsFactoryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerSubComponentsFactoryBinding

    @Inject lateinit var phone : Phone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerSubComponentsFactoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {
                val userComp = (application as DiApplication).provideDaggerUserComponent()
                val phoneComp = userComp.getPhoneComponentFactory().create()
                phoneComp.inject(this@DaggerSubComponentsFactoryActivity)

                phone.startPhone()
            }
        }
    }

}