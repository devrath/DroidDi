package com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R
import com.demo.code.databinding.ConstructorInjectionFragmentBinding
import com.demo.code.databinding.FieldInjectionFragmentBinding
import com.demo.code.typesofdi.dagger.sampleone.concepts.constructorInjection.di.components.DaggerPhoneComponent
import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.di.components.DaggerTvComponent
import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.tvParts.Tv
import javax.inject.Inject

class FieldInjectionFragment : Fragment() {

    companion object {
        fun newInstance() = FieldInjectionFragment()
    }

    private lateinit var viewModel: FieldInjectionViewModel

    private lateinit var _binding: FieldInjectionFragmentBinding
    private val binding get() = _binding

    @Inject
    lateinit var tv : Tv

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FieldInjectionFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FieldInjectionViewModel::class.java)
        DaggerTvComponent.builder().build().inject(this)

        binding.apply {
            actionId.setOnClickListener {
                // Build the tv
                tv.play()
            }
        }
    }

}