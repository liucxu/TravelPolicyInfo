package com.cliu.travel.city.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.cliu.appbase.ui.BaseActivity
import com.cliu.travel.city.bean.ProvinceData
import com.cliu.travel.city.databinding.ActivityCityDataBinding
import com.cliu.travel.city.viewmodel.CityViewModel

/**
 * When it is a independent app, the activity is just for show city list
 * when it is just only one part of the whole app,the activity is for user to select a city,it is the start point of the
 * whole app.
 * Only after user selected a city,we can get the specific policy about COVID-19 and other related infos.
 */
class CityDataActivity : BaseActivity<ActivityCityDataBinding>() {
    private val viewModel:CityViewModel by viewModels<CityViewModel>()
    private val cityList = mutableListOf<ProvinceData.CityData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadCityList()
    }

    override fun createViewBinding(): ActivityCityDataBinding {
        return ActivityCityDataBinding.inflate(layoutInflater)
    }

    /**
     * Activity Call ViewModel and ViewModel call resposity to send http request and
     * get the response from server
     */
    fun loadCityList(){
        viewModel.loadCityList().observe(this, Observer {
            it?.let {
                if(it.error_code == 0){
                    it.result?.let {
                        list ->
                        for (i in list.indices){
                            val data = list[i].citys
                            data?.let {
                                for (index in data.indices){
                                    cityList.add(data[index])
                                }
                            }
                        }
//                        cityList.sort()
                    }
                }
            }
        })
    }
}