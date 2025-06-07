package no.cantara.realestate.sensors;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SensorId {

    private String id;
    private SensorSystem sensorSystem;
    private Map<String, String> identifiers;

    public SensorId() {
    }

    public SensorId(String id) {
        this.id = id;
    }

    public SensorId(String id, SensorSystem sensorSystem, Map<String, String> identifiers) {
        this.id = id;
        this.sensorSystem = sensorSystem;
        this.identifiers = identifiers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTwinId() {
        return id;
    }

    public Map<String, String> getIdentifiers() {
        return identifiers;
    }

    public String getIdentifier(String key) {
        if(identifiers == null) {
            return null;
        }
        return identifiers.get(key);
    }

    public void setIdentifiers(Map<String, String> identifiers) {
        this.identifiers = identifiers;
    }

    public void addIdentifier(String key, String value) {
        if (identifiers == null) {
            identifiers = new HashMap<>();
        }
        identifiers.put(key, value);
    }

    public SensorSystem getSensorSystem() {
        return sensorSystem;
    }

    public void setSensorSystem(SensorSystem sensorSystem) {
        this.sensorSystem = sensorSystem;
    }

    public UniqueKey getMappingKey() {
        throw new UnsupportedOperationException("Not implemented. This method should be overridden in subclasses.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorId sensorId = (SensorId) o;
        return Objects.equals(getId(), sensorId.getId()) && getSensorSystem() == sensorId.getSensorSystem() && Objects.equals(getIdentifiers(), sensorId.getIdentifiers());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSensorSystem(), getIdentifiers());
    }

    @Override
    public String toString() {
        return "SensorId{" +
                "id='" + id + '\'' +
                ", sensorSystem=" + sensorSystem +
                ", identifiers=" + identifiers +
                '}';
    }
}
