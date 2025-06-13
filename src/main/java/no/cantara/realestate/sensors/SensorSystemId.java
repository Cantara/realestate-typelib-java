package no.cantara.realestate.sensors;

import java.util.List;

public interface SensorSystemId {
    SensorSystem getSensorSystem();
    List<String> getIdentifierKeys();
    String getIdentifier(String key);
    String getId();

}
