package no.cantara.realestate.sensors.desigo;

import no.cantara.realestate.sensors.SensorSystem;
import no.cantara.realestate.sensors.SensorSystemId;

import java.util.List;
import java.util.Objects;

public class DesigoSensorSystemId implements SensorSystemId {
    private final SensorSystem sensorSystem = SensorSystem.desigo;
    private final String desigoId;
    private final String desigoPropertyId;

    public DesigoSensorSystemId(String desigoId, String desigoPropertyId) {
        this.desigoId = desigoId;
        this.desigoPropertyId = desigoPropertyId;
    }

    @Override
    public String getId() {
        return desigoId + "." + desigoPropertyId;
    }

    @Override
    public SensorSystem getSensorSystem() {
        return sensorSystem;
    }

    @Override
    public List<String> getIdentifierKeys() {
        return List.of(DesigoSensorId.DESIGO_ID, DesigoSensorId.DESIGO_PROPERTY_ID);
    }

    @Override
    public String getIdentifier(String key) {
        if (key == null) {
            return null;
        }
        String identifier = switch (key) {
            case DesigoSensorId.DESIGO_ID -> desigoId;
            case DesigoSensorId.DESIGO_PROPERTY_ID -> desigoPropertyId;
            default -> null;
        };
        return identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DesigoSensorSystemId that = (DesigoSensorSystemId) o;
        return getSensorSystem() == that.getSensorSystem() && Objects.equals(desigoId, that.desigoId) && Objects.equals(desigoPropertyId, that.desigoPropertyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSensorSystem(), desigoId, desigoPropertyId);
    }
}
