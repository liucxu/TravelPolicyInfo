package com.cliu.travel.city.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cliu.travel.city.bean.ProvinceData
import com.cliu.travel.city.databinding.ItemCityDataBinding

/**
 * City info adapter for city list
 */
class CityAdapter(
    private var datas: List<ProvinceData.CityData>,
    val callback: (ProvinceData.CityData) -> Unit?
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CityInfoAdapterHolder(ItemCityDataBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        @SuppressLint("RecyclerView") position: Int
    ) {
        var cityHolder = holder as CityInfoAdapterHolder
        cityHolder.binding.data = datas[position]
        cityHolder.binding.llParent.setOnClickListener {
            callback?.let {
                callback(datas[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    inner class CityInfoAdapterHolder(val binding: ItemCityDataBinding) :
        RecyclerView.ViewHolder(binding.root)

}