package no.cantara.realestate.plugins.config;

import java.util.Map;
import java.util.Properties;

public class PluginConfig extends Properties {

    Properties config;

    public PluginConfig(Properties config) {
        this.config = config;
    }
    public boolean asBoolean(String key, boolean defaultValue) {
        if (config.containsKey(key)) {
            return Boolean.parseBoolean(config.getProperty(key));
        }
        return defaultValue;
    }

    public String asString(String key, String defaultValue) {
        if (config.containsKey(key)) {
            return config.getProperty(key);
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
