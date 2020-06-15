package com.mix.kotlin_app

import android.app.Application
import android.content.Context
import android.content.res.Resources
import android.net.ConnectivityManager
import android.net.NetworkInfo


/**
 * com.mix.kotlin_app
 * AppManager.kt
 * @Date 2020-06-15
 * @Author GuoBin<guobin201314@gmail.com>
 * @Project kotlin-app
 */
class AppManager: Application() {
    private var mContext: Context? = null

    override fun onCreate() {
        super.onCreate()
        mContext = this
    }

    fun getContext(): Context? {
        return mContext
    }

    fun getResource(): Resources? {
        return mContext!!.resources
    }

    /**
     * 当前网络是否可用
     */
    fun isNetWorkAvailable(): Boolean {
        val connectivityManager =
            mContext!!.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val networkInfo = connectivityManager.activeNetworkInfo
        return networkInfo != null && networkInfo.isConnected
    }
    /**
     * 当前WIFI是否可用
     */
    fun isNetworkWifiAvailable(): Boolean {
        val connectivityManager =
            mContext!!.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (connectivityManager.getNetworkInfo(1) != null) {
            val state = connectivityManager.getNetworkInfo(1)?.state
            return state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING
        }
        return false
    }

}