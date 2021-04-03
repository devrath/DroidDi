package com.demo.code.ui.dagger.selection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.demo.code.databinding.FragmentDaggerSelectionBinding

class DaggerSelectionFragment : Fragment() {

    private var _binding: FragmentDaggerSelectionBinding? = null
    private val binding get() = _binding!!

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
}