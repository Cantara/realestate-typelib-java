package no.cantara.realestate.plugins.config;

import java.util.Map;
import java.util.Properties;

public class PluginConfig extends Properties {

//    Properties config;

    public PluginConfig(Properties config) {
        for (Map.Entry<Object, Object> objectObjectEntry : config.entrySet()) {
            setProperty((String) objectObjectEntry.getKey(), (String) objectObjectEntry.getValue());
        }
    }
    public boolean asBoolean(String key, boolean defaultValue) {
        if (containsKey(key)) {
            return Boolean.parseBoolean(getProperty(key));
        }
        return defaultValue;
    }

    public String asString(String key, String defaultValue) {
        if (containsKey(key)) {
            return getProperty(key);
        }
        return defaultValue;
    }

    public static PluginConfig fromMap(Map<String, String> configMap) {
        Properties properties = new Properties();
        for (Map.Entry<String, String> objectObjectEntry :  configMap.entrySet()) {
            properties.put(objectObjectEntry.getKey(), objectObjectEntry.getValue());
        }
        PluginConfig pluginConfig = new PluginConfig(properties);
        return pluginConfig;
    }
}
