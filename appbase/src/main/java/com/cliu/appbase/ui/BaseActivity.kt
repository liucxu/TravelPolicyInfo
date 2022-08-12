package com.cliu.appbase.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.viewbinding.ViewBinding

/**
 * as the basic activity for all the activity
 */
abstract class BaseActivity<T: ViewBinding>:ComponentActivity() {
    lateinit var binding:T
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = createViewBinding()
        setContentView(binding.root)
    }
    abstract fun createViewBinding():T
}