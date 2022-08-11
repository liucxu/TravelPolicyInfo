package com.cliu.travel.city.api

import com.cliu.appbase.base.ResponseBasicData
import com.cliu.appbase.network.BaseApi
import com.cliu.travel.city.bean.ProvinceData
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Interafce for load city list info
 */
interface CityApi {
    @GET("citys")
    suspend fun loadCityList(@Query("key") key:String = BaseApi.KEY): ResponseBasicData<List<ProvinceData>>
}