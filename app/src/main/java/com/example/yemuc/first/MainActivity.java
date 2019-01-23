package com.example.yemuc.first;

import com.example.core.activity.ProxyActivity;
import com.example.core.delegates.LatteDelegate;

public class MainActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
