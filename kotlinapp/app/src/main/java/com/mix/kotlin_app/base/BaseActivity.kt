package com.mix.kotlin_app.base


import android.os.Bundle
import android.view.View

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.mix.kotlin_app.R


/**
 * com.mix.kotlin_app.base
 * BaseActivity.kt
 * @Date 2020-06-15
 * @Author GuoBin<guobin201314@gmail.com>
 * @Project kotlin-app
 */
abstract class BaseActivity : AppCompatActivity() {
    private var mToolBar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initView()
        initData()
    }

    protected abstract fun getLayoutId(): Int
    protected abstract fun initView()
    protected abstract fun initData()
    private fun <T : View?> bindViewId(resId: Int): T {
        return findViewById<View>(resId) as T
    }

    protected fun setSupportActionBar() {
        mToolBar = bindViewId(R.id.toolbar)
        if (mToolBar != null) {
            setSupportActionBar(mToolBar)
        }
    }

    protected fun setSupportArrowActionBar(isSupport: Boolean) {
        supportActionBar!!.setDisplayHomeAsUpEnabled(isSupport)
    }

    protected fun setActionBarIcon(resId: Int) {
        mToolBar?.setNavigationIcon(resId)
    }
}