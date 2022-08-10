package com.cliu.appbase.network

import android.widget.Toast
import com.cliu.appbase.R
import com.cliu.appbase.base.BaseApplication
import com.cliu.appbase.utils.ToastUtils
import java.io.IOException
import java.net.SocketTimeoutException

object HttpErrorDeal {
    fun dealHttpError(e:Throwable,deal:(()->Unit)?=null){
        when(e){
            is SocketTimeoutException -> {
                ToastUtils.showToast(BaseApplication.context.getString(R.string.request_timed_out))
            }
            is IOException -> {
                ToastUtils.showToast(BaseApplication.context.getString(R.string.server_connection_failed))
            }
            else -> {
                e.message?.let {
                    ToastUtils.showToast(if (it.isNotEmpty()) it else BaseApplication.context.getString(R.string.null_pointer_exception))
                }
            }
        }
    }
}