package com.demo.code.typesofdi.hilt.sampleone.concepts.scopeDemo.objects

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT

class SingletonScopeObject{
    init {
        Log.d(TAG_HILT,"ApplicationContextObject init is invoked")
    }
}