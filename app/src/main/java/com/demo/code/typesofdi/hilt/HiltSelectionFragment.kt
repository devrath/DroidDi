package com.demo.code.typesofdi.hilt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.demo.code.R
import com.demo.code.databinding.FragmentDaggerSelectionBinding
import com.demo.code.databinding.FragmentHiltSelectionBinding
import com.demo.code.typesofdi.dagger.selection.DaggerSelectionViewModel

class HiltSelectionFragment : Fragment() {

    private var _binding: FragmentHiltSelectionBinding? = null
    private val binding get() = _binding!!

    private lateinit var hiltSelectionViewModel: HiltSelectionViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        hiltSelectionViewModel = ViewModelProvider(this).get(HiltSelectionViewModel::class.java)
        _binding = FragmentHiltSelectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            constructorInjectionId.setOnClickListener {

            }

            fieldInjectionId.setOnClickListener {

            }

            methodInjectionId.setOnClickListener {

            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}