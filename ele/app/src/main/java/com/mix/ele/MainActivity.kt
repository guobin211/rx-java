package com.mix.ele

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val webView = findViewById<WebView>(R.id.index_webview)
        // 启用javascript
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = MyWebViewClient()
        webView.webChromeClient = MyWebChromeClient()
        // 加载网页
        webView.loadUrl("http://www.baidu.com")
    }

    private class MyWebViewClient: WebViewClient() {
        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
        }
    }

    private class MyWebChromeClient: WebChromeClient() {
        override fun onProgressChanged(view: WebView?, newProgress: Int) {
            super.onProgressChanged(view, newProgress)
        }
    }

}
