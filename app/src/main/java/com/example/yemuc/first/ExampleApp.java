package com.example.yemuc.first;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.example.core.app.Latte;
import com.joanzapata.iconify.fonts.FontAwesomeModule;

public class ExampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withIcon(new FontAwesomeModule())
                .configure();
    }
}
