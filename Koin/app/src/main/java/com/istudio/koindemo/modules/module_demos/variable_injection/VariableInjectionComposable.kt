package com.istudio.koindemo.modules.module_demos.variable_injection

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import com.istudio.koindemo.service.hello_service.HelloService
import com.istudio.koindemo.ui.composables.AppButton
import org.koin.androidx.compose.koinViewModel
import org.koin.compose.koinInject
import org.koin.java.KoinJavaComponent.inject

@Composable
fun VariableInjectionComposable(navController: NavHostController) {

    val vm = koinViewModel<VariableInjectionVm>()
    val myService = koinInject<HelloService>()

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        val cxt = LocalContext.current

        AppButton(text = "Variable injection Demo", onClick = {
            Toast.makeText(cxt,myService.doSomething(),Toast.LENGTH_LONG).show()
        })


    }

}