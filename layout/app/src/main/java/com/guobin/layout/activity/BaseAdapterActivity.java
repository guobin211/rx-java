package com.guobin.layout.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.guobin.layout.R;

import java.util.ArrayList;
import java.util.List;

public class BaseAdapterActivity extends AppCompatActivity {

    ListView listView;
    List<UserInfo> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);
        listView = findViewById(R.id.base_list_view);
        dataList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            UserInfo userInfo = new UserInfo();
            userInfo.name = "张三" + i;
            userInfo.age = 10 + i + "岁";
            userInfo.sex = i % 2 == 0 ? "男" : "女";
            dataList.add(userInfo);
        }
        listView.setAdapter(new UserInfoListAdapter(dataList));
    }

    class UserInfoListAdapter extends BaseAdapter {

        private List<UserInfo> dataList;

        UserInfoListAdapter(List<UserInfo> data) {
            this.dataList = data;
        }

        @Override
        public int getCount() {
            return dataList.size();
        }

        @Override
        public Object getItem(int i) {
            return dataList.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            // 生成list-item的view实例
            View itemRootView = LayoutInflater.from(BaseAdapterActivity.this).inflate(R.layout.item_userinfo, null);
            final TextView name = itemRootView.findViewById(R.id.name);
            name.setText(dataList.get(i).name);
            name.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(BaseAdapterActivity.this, "姓名:" + name.getText(), Toast.LENGTH_SHORT).show();
                }
            });

            TextView age = itemRootView.findViewById(R.id.age);
            age.setText(dataList.get(i).age);

            TextView sex = itemRootView.findViewById(R.id.sex);
            sex.setText(dataList.get(i).sex);
            return itemRootView;
        }
    }

    class UserInfo {
        String name;
        String age;
        String sex;
    }

}
