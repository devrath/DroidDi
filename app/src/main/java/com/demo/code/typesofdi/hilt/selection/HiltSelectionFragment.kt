package com.demo.code.typesofdi.hilt.selection

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.demo.code.R
import com.demo.code.databinding.FragmentDaggerSelectionBinding
import com.demo.code.databinding.HiltSelectionFragmentBinding
import com.demo.code.typesofdi.dagger.selection.DaggerSelectionViewModel

class HiltSelectionFragment : Fragment() {

    companion object {
        fun newInstance() = HiltSelectionFragment()
    }

    private lateinit var viewModel: HiltSelectionViewModel

    private var _binding: HiltSelectionFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(HiltSelectionViewModel::class.java)
        _binding = HiltSelectionFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            sampleOneId.setOnClickListener {
                findNavController().navigate(R.id.action_nav_hilt_to_hilt_concepts_selection)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}