package com.demo.code.typesofdi.hilt.sampleone.concepts.constructorFieldInjection.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R
import com.demo.code.databinding.HiltConstructorFieldInjectionDemoFragmentBinding
import com.demo.code.typesofdi.hilt.sampleone.concepts.constructorFieldInjection.di.MicroOven
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltConstAndFieldInjectionDemoFragment : Fragment() {

    companion object {
        fun newInstance() = HiltConstAndFieldInjectionDemoFragment()
    }

    @Inject
    lateinit var microOven : MicroOven

    private var _binding: HiltConstructorFieldInjectionDemoFragmentBinding? = null
    private val binding get() = _binding!!

    private lateinit var demoViewModel: HiltConstAndFieldInjectionDemoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        demoViewModel = ViewModelProvider(this).get(HiltConstAndFieldInjectionDemoViewModel::class.java)
        _binding = HiltConstructorFieldInjectionDemoFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            actionId.setOnClickListener {
                microOven.startOven()
            }
        }
    }

}