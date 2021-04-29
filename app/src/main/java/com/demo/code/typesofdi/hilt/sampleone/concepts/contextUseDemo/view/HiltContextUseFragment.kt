package com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.databinding.FragmentHiltContextUseBinding
import com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.vehicleParts.ActivityContextObject
import com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.vehicleParts.ApplicationContextObject
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltContextUseFragment : Fragment() {

    companion object {
        fun newInstance() = HiltContextUseFragment()
    }

    private var _binding: FragmentHiltContextUseBinding? = null
    private val binding get() = _binding!!


    @Inject
    lateinit var ativityContextObject : ActivityContextObject

    @Inject
    lateinit var applicationContextObject : ApplicationContextObject

    private lateinit var viewModelHiltHilt: HiltContextUseViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModelHiltHilt = ViewModelProvider(this).get(HiltContextUseViewModel::class.java)
        _binding = FragmentHiltContextUseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            applicationCxtId.setOnClickListener {
                applicationContextObject.displayMessage()
            }
            activityCxtId.setOnClickListener {
                ativityContextObject.displayMessage()
            }
        }
    }

}