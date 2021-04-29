package com.demo.code.typesofdi.hilt.sampleone.concepts.singletonScope.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.databinding.FragmentHiltSingletonScopeBinding
import com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.vehicleParts.ActivityContextObject
import com.demo.code.typesofdi.hilt.sampleone.concepts.singletonScope.objects.FragmentScopedObject
import com.demo.code.typesofdi.hilt.sampleone.concepts.singletonScope.objects.SingletonScopeObject
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltSingletonScopeFragment : Fragment() {

    companion object {
        fun newInstance() = HiltSingletonScopeFragment()
    }

    private var _binding: FragmentHiltSingletonScopeBinding? = null
    private val binding get() = _binding!!


    @Inject
    lateinit var singletonScopeObject : SingletonScopeObject

    @Inject
    lateinit var fragmentScopedObject : FragmentScopedObject

    private lateinit var viewModelHiltHilt: HiltSingletonScopeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModelHiltHilt = ViewModelProvider(this).get(HiltSingletonScopeViewModel::class.java)
        _binding = FragmentHiltSingletonScopeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            hiltSingletonScopeId.setOnClickListener {
                Log.d(TAG_HILT,"Address ::".plus(" ").plus(singletonScopeObject.hashCode()))
            }
            hiltActivityScopeId.setOnClickListener {
                Log.d(TAG_HILT,"Address ::".plus(" ").plus(fragmentScopedObject.hashCode()))
            }
        }
    }

}