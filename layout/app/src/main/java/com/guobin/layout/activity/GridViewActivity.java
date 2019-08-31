package com.guobin.layout.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.guobin.layout.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridViewActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView = findViewById(R.id.grid_view_menu);

        List<Map<String, String>> dataList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Map<String, String> map = new HashMap<>();
            map.put("menu_name", "菜单" + i);
            dataList.add(map);
        }
        String[] from = {"menu_item"};
        int[] to = {R.id.grid_view_menu};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, dataList, R.layout.grid_item, from, to);

        gridView.setAdapter(simpleAdapter);
    }
}
