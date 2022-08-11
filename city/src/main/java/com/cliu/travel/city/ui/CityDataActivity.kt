package com.cliu.travel.city.ui

import android.os.Bundle
import com.cliu.appbase.ui.BaseActivity
import com.cliu.travel.city.databinding.ActivityCityDataBinding

/**
 * When it is a independent app, the activity is just for show city list
 * when it is just only one part of the whole app,the activity is for user to select a city,it is the start point of the
 * whole app.
 * Only after user selected a city,we can get the specific policy about COVID-19 and other related infos.
 */
class CityDataActivity : BaseActivity<ActivityCityDataBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun createViewBinding(): ActivityCityDataBinding {
        return ActivityCityDataBinding.inflate(layoutInflater)
    }
}