package no.cantara.realestate.observations;

import no.cantara.realestate.sensors.SensorId;

import java.time.Instant;

public class ObservedPresentValue extends ObservedValue {

    public ObservedPresentValue(SensorId sensorId, Number value) {
        super(sensorId, value, Instant.now());
    }
    public ObservedPresentValue(SensorId sensorId, Number value, Instant receivedAt) {
       super(sensorId, value, receivedAt);
    }
}
