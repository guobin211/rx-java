package com.guobin.rx.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.guobin.rx.R
import com.guobin.rx.utils.getAdapter
import com.guobin.rx.utils.getArrayString

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        val listView: ListView = this.findViewById(R.id.list_view)
        val adapter: ArrayAdapter<String> = getAdapter(this, getArrayString(36))
        listView.adapter = adapter
    }

    private fun getJsonList() {

    }
}
