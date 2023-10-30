package no.cantara.realestate.plugins.config;

import org.junit.jupiter.api.Test;

import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PluginConfigTest {

    @Test
    void verifySuper() {
        Properties properties = new Properties();
        properties.setProperty("sd.api.url", "theUrl");
        PluginConfig pluginConfig = new PluginConfig(properties);
        assertEquals("theUrl", pluginConfig.asString("sd.api.url", null));
        assertEquals(1, pluginConfig.size());
        assertEquals("theUrl", pluginConfig.getProperty("sd.api.url"));
    }
}