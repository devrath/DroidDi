package com.demo.code.typesofdi.hilt.sampleone.concepts.providesAnnotation.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R
import com.demo.code.databinding.HiltConstructorFieldInjectionDemoFragmentBinding
import com.demo.code.databinding.HiltProvidesAnnotationFragmentBinding
import com.demo.code.typesofdi.hilt.sampleone.concepts.constructorFieldInjection.di.MicroOven
import com.demo.code.typesofdi.hilt.sampleone.concepts.providesAnnotation.whatsappParts.WhatsApp
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltProvidesAnnotationFragment : Fragment() {

    companion object {
        fun newInstance() = HiltProvidesAnnotationFragment()
    }

    @Inject
    lateinit var whatsApp: WhatsApp

    private var _binding: HiltProvidesAnnotationFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: HiltProvidesAnnotationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewModel = ViewModelProvider(this).get(HiltProvidesAnnotationViewModel::class.java)
        _binding = HiltProvidesAnnotationFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            actionId.setOnClickListener {
                whatsApp.startWhatsApp()
            }
        }
    }

}