package com.guobin.layout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.guobin.layout.R;

import java.util.List;

/**
 * UserInfoListAdapter
 *
 * @author GuoBin on 2019-08-31
 */
public class UserInfoListAdapter extends BaseAdapter {
    /**
     * 数据源
     */
    private List<String> dataList;
    /**
     * 上下文
     */
    private Context context;

    UserInfoListAdapter(List<String> data, Context context) {
        this.dataList = data;
        this.context = context;
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

    /**
     * 生成list-item
     * @param i 索引
     * @param view 视图
     * @param viewGroup 视图组
     * @return 视图
     */
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // 通过自定义item布局资源填充list
        View itemRootView = LayoutInflater.from(context).inflate(R.layout.item_userinfo, null);
        TextView name = itemRootView.findViewById(R.id.name);
        name.setText(dataList.get(i));
        return itemRootView;
    }
}
