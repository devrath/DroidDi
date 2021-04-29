package com.demo.code.typesofdi.hilt.sampleone.concepts.contextUseDemo.vehicleParts

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.demo.code.R
import com.demo.code.typesofdi.hilt.sampleone.concepts.qualifiersDemo.vehicleParts.MarutiEngine
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ActivityContextObject constructor(val context: Context) {

    init {
        Log.d(TAG_HILT,"ActivityContextObject init is invoked")
    }

    fun displayMessage(){
        if(context!=null){
            Log.d(TAG_HILT,"Activity context is not null")
        }
    }

}