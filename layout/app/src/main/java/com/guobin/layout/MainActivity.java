package com.guobin.layout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.guobin.layout.activity.BaseAdapterActivity;
import com.guobin.layout.activity.GridViewActivity;
import com.guobin.layout.activity.LinerLayout;
import com.guobin.layout.activity.ListViewActivity;
import com.guobin.layout.activity.SimpleAdapterActivity;


public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn1.setOnClickListener(this.onListViewClick(1));
        btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(this.onListViewClick(2));
        btn3 = findViewById(R.id.button3);
        btn3.setOnClickListener(this.onListViewClick(3));
        btn4 = findViewById(R.id.button4);
        btn4.setOnClickListener(this.onListViewClick(4));
        btn5 = findViewById(R.id.button5);
        btn5.setOnClickListener(this.onListViewClick(5));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("listview");
        menu.add("linerlayout");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String title = (String) item.getTitle();
        if (title.equals("listview")) {
            Toast.makeText(this, "用户点击了" + title, Toast.LENGTH_SHORT).show();
        } else if (title.equals("linerlayout")) {
            Toast.makeText(this, "用户点击了" + title, Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    private View.OnClickListener onListViewClick(final int id) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                if (id == 1) {
                    intent.setClass(MainActivity.this, ListViewActivity.class);
                } else if (id == 2) {
                    intent.setClass(MainActivity.this, LinerLayout.class);
                } else if (id == 3) {
                    intent.setClass(MainActivity.this, SimpleAdapterActivity.class);
                } else if (id == 4) {
                    intent.setClass(MainActivity.this, BaseAdapterActivity.class);
                } else if (id == 5) {
                    intent.setClass(MainActivity.this, GridViewActivity.class);
                } else {
                    intent.setClass(MainActivity.this, ListViewActivity.class);
                }
                startActivity(intent);
            }
        };
    }
}
