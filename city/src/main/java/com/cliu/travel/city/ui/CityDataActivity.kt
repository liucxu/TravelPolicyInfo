package com.cliu.travel.city.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.cliu.appbase.config.ARouterConfig
import com.cliu.appbase.config.ParamsConfig
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
@Route(path = ARouterConfig.CITY)
class CityDataActivity : BaseActivity<ActivityCityDataBinding>() {
    private val viewModel by viewModels<CityViewModel>()
    private val cityList = mutableListOf<ProvinceData.CityData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        loadCityList()
    }

    override fun createViewBinding(): ActivityCityDataBinding {
        return ActivityCityDataBinding.inflate(layoutInflater)
    }

    private fun initViews(){
        binding.rvData.layoutManager = LinearLayoutManager(this)
        binding.toolbar.setOnClickListener { finish() }
    }

    /**
     * Activity Call ViewModel and ViewModel call resposity to send http request and
     * get the response from server
     */
    private fun loadCityList(){
        viewModel.loadCityList().observe(this, Observer {
            it?.let {
                if(it.error_code == 0){
                    it.result?.let { list ->
                        for (i in list.indices){
                            val data = list[i].citys
                            data?.let {
                                for (index in data.indices){
                                    cityList.add(data[index])
                                }
                            }
                        }
                        val adapter = CityAdapter(cityList,callback={ data ->
                            val intent = Intent()
                            intent.putExtra(ParamsConfig.CITY_ID,data.city_id)
                            intent.putExtra(ParamsConfig.CITY_NAME,data.city)
                            setResult(ParamsConfig.RESULT_CODE_SELECT_CITY,intent)
                            finish()
                        })
                        binding.rvData.adapter = adapter
                    }
                }
            }
        })
    }
}