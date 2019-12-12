package com.mix.ele.jshooks

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.widget.Toast
import com.mix.ele.ui.BottomDialog
import kotlinx.android.synthetic.main.dialog_view.*
import org.json.JSONObject

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-24  18:40
 */
class JavaScriptMethods(ctx: Context, web: WebView) {

    private var data = 0
    private var ctx: Context? = ctx
    private var webView: WebView? = web

    // 自定义dialog
    private val myBottomDialog: BottomDialog by lazy {
        BottomDialog(ctx)
    }

    @JavascriptInterface
    fun sendMessage(json: String): Unit {
        val jsJson = JSONObject(json)
        val phone = jsJson.get("phone")
        // 空安全操作
        val msg: String = jsJson.get("msg") as String ?: "empty message"
        println(msg)
        Toast.makeText(ctx, msg + phone, Toast.LENGTH_SHORT).show()
        // 发送短信息
        val intent = Intent()
    }

    /**
     * H5调用kotlin方法
     */
    @JavascriptInterface
    fun showToast(json: String) {
        Toast.makeText(ctx, json, Toast.LENGTH_SHORT).show()
    }

    /**
     * kotlin方法获取数据并callback
     */
    @JavascriptInterface
    fun kotlinCallback(json: String) {
        val jsJson = JSONObject(json)
        // 获取callback方法
        val callback = jsJson.optString("callback")
        // 必须在主线程执行webview方法
        callbackJavascript(callback, data.toString())
        data++
    }

    @JavascriptInterface
    fun showPhoneDialog(phone: String) {
        myBottomDialog.phone.text = phone
        myBottomDialog.cancel_btn.setOnClickListener {
            myBottomDialog.dismiss()
        }
        // 拨打电话
        myBottomDialog.phone.setOnClickListener {
            callPhone(phone)
        }
        myBottomDialog.show()
    }

    /*
    * lambda表达式
    * 拨号功能
    * */
    var callPhone = { phone: String ->
        val intent: Intent = Intent()
        intent.action = "android.intent.action.VIEW"
        intent.action = "android.intent.action.DIAL"
        intent.addCategory("android.intent.category.DEFAULT")
        intent.addCategory("android.intent.category.DEFAULT")
        intent.addCategory("android.intent.category.BROWSABLE")
        intent.data = Uri.parse("tel:$phone")
        ctx.startActivity(intent)
    }

    // 统一管理callback数据传递
    private fun callbackJavascript(callback: String, data: String) {
        webView?.post(Send(callback, data))
    }

    // 必须在主线程执行webview方法
    inner class Send(private val callback: String, private val data: String) : Runnable {
        override fun run() {
            val json = JSONObject()
            json.put("data", data)
            webView?.loadUrl("javascript:$callback(${json.toString()})")
        }
    }
}

