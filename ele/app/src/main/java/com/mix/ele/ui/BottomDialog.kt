package com.mix.ele.ui

import android.app.Dialog
import android.content.Context
import android.view.Gravity
import android.view.ViewGroup
import com.mix.ele.R

/**
 * @author guobin211
 * @version 0.0.1
 * @date 2019-11-24  19:50
 */
class BottomDialog: Dialog {

    constructor(context: Context) : this(context, 0)

    constructor(context: Context, themeResId: Int): super(context, R.style.btm_dialog) {
        setContentView(R.layout.dialog_view)
        // 设置显示位置
        window?.setGravity(Gravity.BOTTOM)
        window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
    }

}