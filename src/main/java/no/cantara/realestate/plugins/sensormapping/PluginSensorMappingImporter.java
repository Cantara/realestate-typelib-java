package no.cantara.realestate.plugins.sensormapping;

import no.cantara.realestate.plugins.config.PluginConfig;
import no.cantara.realestate.sensors.MappedSensorId;

import java.util.List;

public abstract class PluginSensorMappingImporter {

    public final PluginConfig config;

    public PluginSensorMappingImporter(PluginConfig config) {
        this.config = config;
    }
    boolean asBoolean(String key, boolean defaultValue) {
        return config.asBoolean(key, defaultValue);
    }
    String asString(String key, String defaultValue) {
        return config.asString(key, defaultValue);
    }
    public abstract List<MappedSensorId> importSensorMappings();
}
