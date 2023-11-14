package no.cantara.realestate.observations;

import no.cantara.realestate.sensors.SensorId;

import java.time.Instant;

public class ObservedTrendedValue extends ObservedValue {

    public ObservedTrendedValue(SensorId sensorId, Number value) {
        super(sensorId, value, Instant.now());
    }
    public ObservedTrendedValue(SensorId sensorId, Number value, Instant receivedAt) {
       super(sensorId, value, receivedAt);
    }
}
