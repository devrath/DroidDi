package com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.databinding.FragmentHiltQualifiersBinding
import com.demo.code.databinding.HiltBindAnnotationFragmentBinding
import com.demo.code.typesofdi.hilt.sampleone.concepts.bindsAnnotation.vehicleParts.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltQualifiersFragment : Fragment() {

    companion object {
        fun newInstance() = HiltQualifiersFragment()
    }

    private var _binding: FragmentHiltQualifiersBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var car: Car

    private lateinit var viewModelHilt: HiltQualifiersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModelHilt = ViewModelProvider(this).get(HiltQualifiersViewModel::class.java)
        _binding = FragmentHiltQualifiersBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            actionOneId.setOnClickListener {

            }
            actionTwoId.setOnClickListener {

            }
        }
    }

}