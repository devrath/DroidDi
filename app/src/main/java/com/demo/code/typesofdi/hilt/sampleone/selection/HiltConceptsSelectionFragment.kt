package com.demo.code.typesofdi.hilt.sampleone.selection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.demo.code.R
import com.demo.code.databinding.FragmentHiltSelectionBinding

class HiltConceptsSelectionFragment : Fragment() {

    private var _binding: FragmentHiltSelectionBinding? = null
    private val binding get() = _binding!!

    private lateinit var hiltConceptsSelectionViewModel: HiltConceptsSelectionViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        hiltConceptsSelectionViewModel = ViewModelProvider(this).get(HiltConceptsSelectionViewModel::class.java)
        _binding = FragmentHiltSelectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            constructorInjectionId.setOnClickListener {
                findNavController().navigate(R.id.action_hiltConceptsSelectionFragment_to_hiltConstructorInjectionFragment)
            }

            fieldInjectionId.setOnClickListener {
                findNavController().navigate(R.id.action_hiltConceptsSelectionFragment_to_hiltFieldInjectionFragment)
            }

            methodInjectionId.setOnClickListener {
                findNavController().navigate(R.id.action_hiltConceptsSelectionFragment_to_hiltMethodInjectionFragment)
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}