package com.guobin.layout.activity;


import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import com.guobin.layout.R;

/**
 * @author guobin
 */
public class ExpandList extends AppCompatActivity {

    ExpandableListView expandableListView;

    String[] group = {"腾讯", "百度", "阿里"};
    String[][] childList = {
            {"QQ", "微信"},
            {"贴吧", "网盘"},
            {"支付宝", "淘宝"},
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expand_list);
        expandableListView = findViewById(R.id.my_expand_list_view);
    }
}
