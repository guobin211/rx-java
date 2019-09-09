package com.guobin.layout.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.guobin.layout.R;

/**
 * SelfListItem
 *
 * @author GuoBin on 2019-08-31
 */
public class SelfListItem extends LinearLayout {

    private TextView leftText;
    private TextView contentText;
    private ImageView imageView;

    public SelfListItem(Context context) {
        super(context);
        leftText = findViewById(R.id.left_text);
        contentText = findViewById(R.id.content_text);
        imageView = findViewById(R.id.image_view);
    }

    public SelfListItem(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        leftText = findViewById(R.id.left_text);
        contentText = findViewById(R.id.content_text);
        imageView = findViewById(R.id.image_view);
    }

    public SelfListItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        leftText = findViewById(R.id.left_text);
        contentText = findViewById(R.id.content_text);
        imageView = findViewById(R.id.image_view);
    }

    public SelfListItem(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        leftText = findViewById(R.id.left_text);
        contentText = findViewById(R.id.content_text);
        imageView = findViewById(R.id.image_view);
    }

    public void setView(String left, String right, Boolean image) {
        if (left != null) {
            leftText.setText(left);
        }
        if (right != null) {
            contentText.setText(right);
        }
        if (image != null) {
            imageView.setImageResource(R.drawable.ic_launcher_background);
        }
    }
}
