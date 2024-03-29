package no.cantara.realestate;

@Deprecated //"use no.cantara.realestate.sensors.SensorId from typelib-java instead"
public abstract class SensorId {

    private String id;

    public SensorId() {
    }

    public SensorId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract UniqueKey getMappingKey();

    @Override
    public String toString() {
        return "SensorId{" +
                "id='" + id + '\'' +
                '}';
    }
}
