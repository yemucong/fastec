package com.example.core.app;

import android.content.Context;

import java.util.HashMap;

public final class Latte {

    public static Configurator init(Context context){
        getConfigurations().put(ConfigTypes.APPLICATION_CONTEXT.name(), context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static HashMap<String, Object> getConfigurations() {
        return Configurator.getInstance().getConfigs();
}

    public static Context getApplication(){
        return (Context) getConfigurations().get(ConfigTypes.APPLICATION_CONTEXT.name());
    }
}
