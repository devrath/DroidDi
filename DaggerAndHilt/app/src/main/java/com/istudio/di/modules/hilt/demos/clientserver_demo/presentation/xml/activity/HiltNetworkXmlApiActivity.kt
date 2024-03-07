package com.istudio.di.modules.hilt.demos.clientserver_demo.presentation.xml.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.istudio.di.databinding.ActivityHiltNetworkApiBinding
import com.istudio.di.modules.hilt.demos.clientserver_demo.data.model.User
import com.istudio.di.modules.hilt.demos.clientserver_demo.presentation.xml.state.NetworkApiDemoUiState
import com.istudio.di.modules.hilt.demos.clientserver_demo.presentation.xml.vm.HiltNetworkXmlApiVm
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HiltNetworkXmlApiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHiltNetworkApiBinding
    private lateinit var adapter: MainAdapter

    private val viewModel: HiltNetworkXmlApiVm by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHiltNetworkApiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupUI()
        setupObserver()
    }

    private fun setupUI() {
        adapter = MainAdapter(arrayListOf())

        binding.peopleListViewId.layoutManager = LinearLayoutManager(this)
        binding.peopleListViewId.addItemDecoration(
            DividerItemDecoration(
                binding.peopleListViewId.context,
                (binding.peopleListViewId.layoutManager as LinearLayoutManager).orientation
            )
        )
        binding.peopleListViewId.adapter = adapter
    }

    private fun setupObserver() {
        viewModel.state.observe(this, Observer {
            when (it) {
                is NetworkApiDemoUiState.Data -> {
                    renderList(it.data)
                    binding.apply {
                        progressBar.visibility = View.GONE
                        peopleListViewId.visibility = View.VISIBLE
                    }
                }

                is NetworkApiDemoUiState.Error -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }

                is NetworkApiDemoUiState.Loading -> {
                    binding.apply {
                        progressBar.visibility = View.VISIBLE
                        peopleListViewId.visibility = View.GONE
                    }
                }
            }
        })
    }

    private fun renderList(users: List<User>) {
        adapter.addData(users)
        adapter.notifyDataSetChanged()
    }

}