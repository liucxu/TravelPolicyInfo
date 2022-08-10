package com.cliu.travelinfo

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.cliu.appbase.ui.BaseActivity
import com.cliu.travelinfo.databinding.ActivityMainBinding


/**
 * TravelInfo App 的入口
 * 会通过ARouter跳转到其他的模块
 */
class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun createViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

}