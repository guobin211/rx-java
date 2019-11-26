package com.mix.qplayer.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.toast

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-26  22:04
 */
abstract class BaseActivity : AppCompatActivity(), AnkoLogger {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLayoutId())
        initListener()
        initData()
        debug {
            "BaseActivity onCreate()"
        }
    }

    /**
     * 获取布局资源id
     */
    abstract fun getLayoutId(): Int

    open fun initListener() {}

    open fun initData() {}

    fun baseToast(msg: String) {
        runOnUiThread {
            toast(msg)
        }
    }


}