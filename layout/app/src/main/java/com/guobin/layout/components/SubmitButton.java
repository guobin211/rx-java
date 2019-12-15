package com.guobin.layout.components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.Button;


/**
 * @author guobin211
 * @version 0.0.1
 */
@SuppressLint("AppCompatCustomView")
public class SubmitButton extends Button {
    public SubmitButton(Context context, AttributeSet attributes) {
        super(context, attributes);
        init();
    }

    private void init() {
        setBackgroundColor(Color.rgb(102, 52, 204));
        setTextColor(Color.WHITE);
        setTextSize(16.0f);
        setText("提交");
    }
}
