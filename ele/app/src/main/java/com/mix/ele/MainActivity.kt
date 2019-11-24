package com.mix.ele

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import com.mix.ele.jshooks.JavaScriptMethods
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    // 懒加载webView
    private val webView: WebView by lazy {
        findViewById<WebView>(R.id.index_webview)
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 启用javascript
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = MyWebViewClient()
        webView.webChromeClient = MyWebChromeClient()
        // 1. 注册kotlin方法 到 H5
        webView.addJavascriptInterface(JavaScriptMethods(this, webView), "jsInterface")

        // 加载网页
        val index = "file:///android_asset/index.html"
        webView.loadUrl(index)
    }

    private inner class MyWebViewClient: WebViewClient() {
        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            val json = JSONObject()
            json.put("name", "kotlin")
            // 2. kotlin调用javscript方法
            webView.loadUrl("javascript:showMessage(${json.toString()})")
        }
    }

    private class MyWebChromeClient: WebChromeClient() {
        override fun onProgressChanged(view: WebView?, newProgress: Int) {
            super.onProgressChanged(view, newProgress)
        }
    }

}
