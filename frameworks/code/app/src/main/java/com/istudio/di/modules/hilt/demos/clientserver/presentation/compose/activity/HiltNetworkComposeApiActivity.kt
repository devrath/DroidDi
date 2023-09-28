package com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.activity.ui.screens.PeopleListScreen
import com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.activity.ui.theme.CodeTheme
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