package com.example.core.app;

import com.joanzapata.iconify.IconFontDescriptor;
import com.joanzapata.iconify.Iconify;

import java.util.ArrayList;
import java.util.HashMap;

public class Configurator {

    private static final HashMap<String, Object> CONFIGS = new HashMap<>();
    private static final ArrayList<IconFontDescriptor> ICONS = new ArrayList<>();

    private Configurator() {
        CONFIGS.put(ConfigTypes.CONFIG_READY.name(), false);
    }

    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }

    public static Configurator getInstance(){
        return Holder.INSTANCE;
    }

    final HashMap<String, Object> getConfigs() {
        return CONFIGS;
    }

    public final void configure() {                      //完成状态
        initIcons();
        CONFIGS.put(ConfigTypes.CONFIG_READY.name(), true);
    }

    final <T> T getConfiguration(Enum<ConfigTypes> key){
        checkConfiguration();
        return (T)CONFIGS.get(key.name());
    }

    private void checkConfiguration() {
        final boolean isReady = (boolean) CONFIGS.get(ConfigTypes.CONFIG_READY.name());
        if(!isReady){
            throw new RuntimeException("Configuration is not ready");
        }
    }

    public final Configurator withApiHost(String host) {
        CONFIGS.put(ConfigTypes.API_HOST.name(), host);
        return this;
    }

    public final Configurator withIcon(IconFontDescriptor descriptor){
        ICONS.add(descriptor);
        return this;
    }

    private void initIcons(){
        if(ICONS.size()>0){
            final Iconify.IconifyInitializer initializer = Iconify.with(ICONS.get(0));
            for (int i = 1; i < ICONS.size(); i++) {
                initializer.with(ICONS.get(i));
            }
        }
    }

}
