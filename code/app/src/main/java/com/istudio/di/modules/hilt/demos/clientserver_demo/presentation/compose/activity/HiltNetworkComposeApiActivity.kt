package com.istudio.di.modules.hilt.demos.clientserver_demo.presentation.compose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.istudio.di.modules.hilt.demos.clientserver_demo.presentation.compose.activity.ui.screens.PeopleListScreen
import com.istudio.di.modules.hilt.demos.clientserver_demo.presentation.compose.activity.ui.theme.CodeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HiltNetworkComposeApiActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeTheme {
                PeopleListScreen()
            }
        }
    }
}