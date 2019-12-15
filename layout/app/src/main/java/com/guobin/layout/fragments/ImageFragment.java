package com.guobin.layout.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.guobin.layout.R;

/**
 * @author guobin211
 * @version 0.0.1
 */
public class ImageFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Log.i("ImageFragment", "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        Log.i("ImageFragment", "onCreateView");
        return inflater.inflate(R.layout.frag_image_center, container, false);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("ImageFragment", "onDestroy");
    }
}
