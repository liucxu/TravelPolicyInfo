package com.cliu.travel.city.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.cliu.appbase.network.HttpErrorDeal
import com.cliu.travel.city.respository.CityResposity
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

/**
 * load city list data and convert the result to LiveData type
 * so ui can observe the data
 */
class CityViewModel:ViewModel() {

    /**
     * load city list data
     */
    fun loadCityList() = flow {
        val citys = CityResposity().loadCityList()
        emit(citys)
    }.catch {
        if (it is Exception) {
            HttpErrorDeal.dealHttpError(it)
        }
        emit(null)
    }.asLiveData()
}