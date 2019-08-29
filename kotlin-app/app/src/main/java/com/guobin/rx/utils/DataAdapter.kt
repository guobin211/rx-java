package com.guobin.rx.utils

import android.content.Context
import android.widget.ArrayAdapter

/**
 * DataAdapter
 * @author GuoBin on 2019-08-29
 */

fun getArrayString(num: Int): List<String> {
    val res = mutableListOf<String>()
    for (x in 1..num) {
        res.add("第${x}个")
    }
    return res
}
/**
 * 生成适配器
 */
fun getAdapter(ctx: Context, params: List<String>): ArrayAdapter<String> {
    return ArrayAdapter(
        ctx,
        android.R.layout.simple_spinner_dropdown_item,
        android.R.id.text1,
        params
    )
}
