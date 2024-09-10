package no.cantara.realestate.sensors;


import java.util.Objects;

public class TrendId {

    private String id;
    private SensorSystem sensorSystem;


    public TrendId() {
    }

    public TrendId(String id) {
        this.id = id;
    }

    public TrendId(String id, SensorSystem sensorSystem) {
        this.id = id;
        this.sensorSystem = sensorSystem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        TrendId trendId = (TrendId) o;
        return Objects.equals(getId(), trendId.getId()) && getSensorSystem() == trendId.getSensorSystem();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getSensorSystem());
    }

    @Override
    public String toString() {
        return "TrendId{" +
                "id='" + id + '\'' +
                ", sensorSystem=" + sensorSystem +
                '}';
    }
}
