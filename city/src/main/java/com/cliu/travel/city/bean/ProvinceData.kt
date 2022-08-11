package com.cliu.travel.city.bean

/**
 * the province Bean
 * in this class,there is a inner class called CityData which contains the name and the id
 * of a specific city
 */
class ProvinceData {
    val province_id:String = ""
    val province:String = ""
    val citys:List<CityData>? = null
    class CityData{
        val city_id:String = ""
        val city = ""
    }
}