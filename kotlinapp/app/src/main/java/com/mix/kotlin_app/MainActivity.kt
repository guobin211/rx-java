package com.mix.kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

enum class LogType(type: String) {
    Lifecycle("Lifecycle"),
}

val logType: LogType = LogType.Lifecycle

fun log(s: String) {
    Log.e(logType.name, s)
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("onCreate")
        setContentView(R.layout.activity_main)
    }

    /**
     * 启动
     */
    override fun onStart() {
        super.onStart()
        log("onStart")
    }

    /**
     * 唤醒
     */
    override fun onResume() {
        super.onResume()
        log("onResume")
    }

    /**
     * 进入主界面
     */
    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        log("onAttachedToWindow")
    }

    /**
     * 调出运行程序管理界面再返回
     */
    override fun onRestart() {
        super.onRestart()
        log("onRestart")
    }

    /**
     * 退出主界面
     */
    override fun onPause() {
        super.onPause()
        log("onPause")
    }

    /**
     * 停止当前activity
     */
    override fun onStop() {
        super.onStop()
        log("onStop")
    }

    /**
     * 退出应用会执行销毁组件
     */
    override fun onDestroy() {
        super.onDestroy()
        log("onDestroy")
    }
}