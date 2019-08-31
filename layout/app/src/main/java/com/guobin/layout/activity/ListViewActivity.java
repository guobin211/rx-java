package com.guobin.layout.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.guobin.layout.R;

public class ListViewActivity extends AppCompatActivity {
    String[] dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        dataList = buildList();
        android.widget.ListView listView = findViewById(R.id.list_view_demo);
        ArrayAdapter<String> adapter = buildAdapter();
        listView.setAdapter(adapter);
    }

    /**
     * 适配器
     * @return ArrayAdapter
     */
    private ArrayAdapter<String> buildAdapter() {
        // 使用系统的布局资源生成list_item
        return new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,android.R.id.text1, dataList);
    }

    private String[] buildList() {
        String[] res = new String[20];
        for (int i = 0; i < 20; i++) {
            res[i] = "第" + (i + 1)+ "个";
        }
        return res;
    }
}
