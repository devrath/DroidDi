package com.demo.code.typesofdi.dagger.sampleone.concepts.singletonscope.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.demo.code.R
import com.demo.code.databinding.FieldInjectionFragmentBinding
import com.demo.code.databinding.FragmentSingletonScopeBinding
import com.demo.code.typesofdi.dagger.sampleone.concepts.fieldInjection.view.FieldInjectionViewModel

class SingletonScopeFragment : Fragment() {

    companion object {
        fun newInstance() = SingletonScopeFragment()
    }

    private lateinit var viewModel: SingletonScopeViewModel

    private lateinit var _binding: FragmentSingletonScopeBinding
    private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        _binding = FragmentSingletonScopeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SingletonScopeViewModel::class.java)

    }

}