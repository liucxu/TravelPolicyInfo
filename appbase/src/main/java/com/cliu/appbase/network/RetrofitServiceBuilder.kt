package com.cliu.appbase.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Now on master branch,I not using hilt library for the function.
 * I know it is not a good implement.
 * After the full function of the application,I will create a branch for using Hilt.
 */
object RetrofitServiceBuilder {
    fun <T> createRetrofitService(clazz: Class<T>,host:String = BaseApi.HOST_URL):T?{
        //add customized http interceptor
        val interceptor = HttpLoggingInterceptor(object:HttpLoggingInterceptor.Logger{
            override fun log(message: String) {
                message?.let {
                    HttpLoggingInterceptor.Logger.DEFAULT.log(message)
                }
            }
        })
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        val builder = OkHttpClient.Builder().addInterceptor(interceptor)
        val retrofit = Retrofit.Builder()
            .baseUrl(host)
            .client(builder.build())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(clazz)
    }
}