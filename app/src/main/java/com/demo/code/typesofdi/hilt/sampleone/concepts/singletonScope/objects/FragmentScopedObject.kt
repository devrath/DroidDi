package com.demo.code.typesofdi.hilt.sampleone.concepts.singletonScope.objects

import android.util.Log
import com.demo.code.typesofdi.hilt.sampleone.selection.TAG_HILT

class FragmentScopedObject {
    init {
        Log.d(TAG_HILT,"FragmentScopedObject init is invoked")
    }
}