package com.cliu.travel.city.respository

import com.cliu.appbase.base.ResponseBasicData
import com.cliu.appbase.network.RetrofitServiceBuilder
import com.cliu.travel.city.api.CityApi
import com.cliu.travel.city.bean.ProvinceData

/**
 * Data Center
 * data is not just from net but also from room
 */
class CityResposity {

    /**
     * create the service
     */
    private var network = RetrofitServiceBuilder.createRetrofitService(CityApi::class.java)

    /**
     * load city list data
     */
    suspend fun loadCityList(): ResponseBasicData<List<ProvinceData>>?{
        network?.let {
            return it.loadCityList()
        }?:return null
    }
}