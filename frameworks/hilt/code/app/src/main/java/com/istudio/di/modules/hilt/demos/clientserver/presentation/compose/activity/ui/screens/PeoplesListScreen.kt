package com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.activity.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import com.istudio.di.modules.hilt.demos.clientserver.presentation.compose.vm.HiltNetworkComposeApiVm

@Composable
fun PeopleListScreen() {

    val viewModel: HiltNetworkComposeApiVm = hiltViewModel()
    val state = rememberLazyListState()

    LazyColumn(
        state = state,
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(viewModel.viewState.data) { data ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(vertical = 15.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Image(
                    painter = rememberAsyncImagePainter(data.avatar),
                    contentDescription = null,
                    modifier = Modifier.size(60.dp)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Column {

                    Text(
                        text = data.name,
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 18.sp
                    )

                    Text(
                        text = data.email,
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 12.sp
                    )
                }
            }
        }
    }

}