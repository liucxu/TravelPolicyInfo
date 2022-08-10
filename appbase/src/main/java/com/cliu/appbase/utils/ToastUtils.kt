package com.cliu.appbase.utils

import android.widget.Toast
import com.cliu.appbase.base.BaseApplication

object ToastUtils {
    fun showToast(message:String){
        Toast.makeText(BaseApplication.context,message,Toast.LENGTH_LONG).show()
    }
}