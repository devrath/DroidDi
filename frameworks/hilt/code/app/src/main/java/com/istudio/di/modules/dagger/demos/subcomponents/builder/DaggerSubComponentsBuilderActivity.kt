package com.istudio.di.modules.dagger.demos.subcomponents.builder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.istudio.di.DiApplication
import com.istudio.di.R
import com.istudio.di.databinding.ActivityDaggerSubComponentsBinding
import com.istudio.di.databinding.ActivityDaggerSubComponentsBuilderBinding
import com.istudio.di.databinding.ActivityDaggerSubComponentsFactoryBinding
import com.istudio.di.modules.dagger.demos.subcomponents.builder.implementations.phone.Phone
import javax.inject.Inject

class DaggerSubComponentsBuilderActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerSubComponentsBuilderBinding

    @Inject lateinit var phone : Phone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerSubComponentsBuilderBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setOnClickListeners();
    }

    private fun setOnClickListeners() {
        binding.apply {
            initiateId.setOnClickListener {

                val userBuilderComponent = (application as DiApplication).provideDaggerUserBuilderComponent()
                val phoneBuilderComp = userBuilderComponent.getPhoneComponentBuilder().build()
                phoneBuilderComp.inject(this@DaggerSubComponentsBuilderActivity)

                phone.startPhone()

            }
        }
    }
}