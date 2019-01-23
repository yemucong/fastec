package com.example.yemuc.first;

import android.os.Bundle;
import android.view.View;

import com.example.core.delegates.LatteDelegate;

public class ExampleDelegate extends LatteDelegate {
    //设置布局，作为一个fragment
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }
    //操作
    @Override
    public void onBindView(Bundle savedInstanceState, View rootView) {

    }
}
