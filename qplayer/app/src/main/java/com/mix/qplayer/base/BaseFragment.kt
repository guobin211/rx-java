package com.mix.qplayer.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-26  22:11
 */
abstract class BaseFragment: Fragment(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
        debug {
            "BaseFragment onCreate"
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return initView()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    abstract fun initView(): View?

    abstract fun init(): Unit

    private fun initData() {}

    private fun initListener() {}

    fun baseToast(msg: String) {
        context?.runOnUiThread {
            toast(msg)
        }
    }
}