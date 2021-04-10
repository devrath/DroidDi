package com.demo.code.typesOfDi.dagger.selection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.demo.code.R
import com.demo.code.databinding.FragmentDaggerSelectionBinding

const val TAG_DAGGER = "Dagger"

class DaggerSelectionFragment : Fragment() {

    private lateinit var _binding: FragmentDaggerSelectionBinding
    private val binding get() = _binding

    private lateinit var daggerSelectionViewModel: DaggerSelectionViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        daggerSelectionViewModel =ViewModelProvider(this).get(DaggerSelectionViewModel::class.java)
        _binding = FragmentDaggerSelectionBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            automobileSampleId.setOnClickListener {
                findNavController().navigate(R.id.action_nav_dagger_to_automobileFragment)
            }
        }
    }
}