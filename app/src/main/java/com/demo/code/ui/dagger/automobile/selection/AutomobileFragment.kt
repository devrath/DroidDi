package com.demo.code.ui.dagger.automobile.selection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.demo.code.R
import com.demo.code.databinding.AutomobileFragmentBinding


class AutomobileFragment : Fragment() {

    private lateinit var _binding: AutomobileFragmentBinding
    private val binding get() = _binding

    private lateinit var viewModel: AutomobileViewModel

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AutomobileViewModel::class.java)
        _binding = AutomobileFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            constructorInjectionId.setOnClickListener {
                
            }

            fieldInjectionId.setOnClickListener {

            }

            providesAnnotationId.setOnClickListener {

            }

            bindsAnnotationId.setOnClickListener {

            }
        }
    }

}