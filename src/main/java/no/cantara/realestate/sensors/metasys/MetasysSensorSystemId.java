package no.cantara.realestate.sensors.metasys;

import no.cantara.realestate.sensors.SensorSystem;
import no.cantara.realestate.sensors.SensorSystemId;

import java.util.List;

public class MetasysSensorSystemId implements SensorSystemId {
    private final SensorSystem sensorSystem = SensorSystem.metasys;
    private final String mesasysObjectId;

    public MetasysSensorSystemId(String mesasysObjectId) {
        this.mesasysObjectId = mesasysObjectId;
    }

    @Override
    public String getId() {
        return mesasysObjectId;
    }

    @Override
    public SensorSystem getSensorSystem() {
        return sensorSystem;
    }

    @Override
    public List<String> getIdentifierKeys() {
        return List.of(MetasysSensorId.METASYS_OBJECT_ID);
    }

    @Override
    public String getIdentifier(String key) {
        if (key == null) {
            return null;
        }
        String identifier = switch (key) {
            case MetasysSensorId.METASYS_OBJECT_ID -> mesasysObjectId;
            default -> null;
        };
        return identifier;
    }


}
