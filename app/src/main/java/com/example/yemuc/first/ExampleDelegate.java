package com.example.yemuc.first;

import android.os.Bundle;
import android.view.View;

import com.example.core.delegates.LatteDelegate;

public class ExampleDelegate extends LatteDelegate {
    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(Bundle savedInstanceState, View rootView) {

    }
}
