package no.cantara.realestate.sensors;


import no.cantara.realestate.rec.SensorRecObject;

public class MappedSensorId {

    private final SensorId sensorId;
    private final SensorRecObject rec;

    public MappedSensorId(SensorId sensorId, SensorRecObject rec) {
        this.sensorId = sensorId;
        this.rec = rec;
    }

    public SensorId getSensorId() {
        return sensorId;
    }

    public SensorRecObject getRec() {
        return rec;
    }

    @Override
    public String toString() {
        return "MappedSensorId{" +
                "sensorId=" + sensorId +
                ", rec=" + rec +
                '}';
    }
}
