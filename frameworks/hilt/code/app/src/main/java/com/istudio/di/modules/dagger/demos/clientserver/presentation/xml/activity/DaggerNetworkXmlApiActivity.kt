package com.istudio.di.modules.dagger.demos.clientserver.presentation.xml.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.istudio.di.databinding.ActivityDaggerNetworkXmlApiBinding
import com.istudio.di.modules.dagger.demos.clientserver.data.model.DaggerUser
import com.istudio.di.modules.dagger.demos.clientserver.presentation.xml.state.NetworkDaggerApiDemoUiState
import com.istudio.di.modules.dagger.demos.clientserver.presentation.xml.vm.DaggerNetworkXmlApiVm
import com.istudio.di.modules.hilt.demos.clientserver.data.model.User
import com.istudio.di.modules.hilt.demos.clientserver.presentation.xml.activity.MainAdapter
import com.istudio.di.modules.hilt.demos.clientserver.presentation.xml.state.NetworkApiDemoUiState

class DaggerNetworkXmlApiActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaggerNetworkXmlApiBinding

    private lateinit var adapter: DaggerAdapter

    lateinit var viewModel: DaggerNetworkXmlApiVm
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDaggerNetworkXmlApiBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this)[DaggerNetworkXmlApiVm::class.java]
        setupUI()
        setupObserver()
    }

    private fun setupUI() {
        adapter = DaggerAdapter(arrayListOf())

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
                is NetworkDaggerApiDemoUiState.Data -> {
                    renderList(it.data)
                    binding.apply {
                        progressBar.visibility = View.GONE
                        peopleListViewId.visibility = View.VISIBLE
                    }
                }

                is NetworkDaggerApiDemoUiState.Error -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }

                is NetworkDaggerApiDemoUiState.Loading -> {
                    binding.apply {
                        progressBar.visibility = View.VISIBLE
                        peopleListViewId.visibility = View.GONE
                    }
                }
            }
        })
    }
    private fun renderList(users: List<DaggerUser>) {
        adapter.addData(users)
        adapter.notifyDataSetChanged()
    }
}