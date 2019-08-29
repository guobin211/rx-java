package com.guobin.rx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import com.guobin.rx.activity.ListViewActivity

/**
 * @author guobin 2019-8-26
 */
class MainActivity : AppCompatActivity() {

    /**
     * 生命周期应用启动
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 设置启动的activity
        setContentView(R.layout.activity_main)
        val btn1: Button = findViewById(R.id.button1)
        btn1.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, ListViewActivity().javaClass)
            startActivity(intent)
        }
    }

    /**
     * 生成适配器
     */
    private fun getAdapter(params: List<String>): ArrayAdapter<String> {
        return ArrayAdapter(
            this,
            android.R.layout.simple_spinner_dropdown_item,
            android.R.id.text1,
            params
        )
    }

    /**
     * 获取列表数据
     */
    private fun getData(): List<String> {
        return listOf("第一个", "第二个")
    }
}
