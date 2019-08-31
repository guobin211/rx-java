package com.guobin.layout.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.guobin.layout.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        listView = findViewById(R.id.simple_adapter);

        List<Map<String, String>> dataList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            Map<String, String> map = new HashMap<>();
            map.put("name", "张三" + i);
            map.put("sex", i % 2 == 0 ? "男" : "女");
            map.put("age", 10 + i + "");
            dataList.add(map);
        }
        // 数据源
        String[] from = {"name", "age", "sex"};
        // 对应的布局资源id
        int[] to ={R.id.name, R.id.age, R.id.sex};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, dataList,R.layout.item_userinfo, from, to);
        listView.setAdapter(simpleAdapter);
    }
}
