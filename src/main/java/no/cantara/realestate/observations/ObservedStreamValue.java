package no.cantara.realestate.observations;

import no.cantara.realestate.sensors.SensorId;

import java.time.Instant;

public class ObservedStreamValue extends ObservedValue {

    public ObservedStreamValue(SensorId sensorId, Number value) {
        super(sensorId, value, Instant.now());
    }
    public ObservedStreamValue(SensorId sensorId, Number value, Instant receivedAt) {
       super(sensorId, value, receivedAt);
    }
}
