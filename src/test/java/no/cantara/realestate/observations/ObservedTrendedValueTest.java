package no.cantara.realestate.observations;

import no.cantara.realestate.sensors.SensorId;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

class ObservedTrendedValueTest {

    @Test
    void verifyObservedAt() {
        SensorId sensorId = mock(SensorId.class);
        int value = 1234;
        Instant receivedAt = Instant.now();
        Instant observedAt = Instant.now().minusSeconds(5);
        ObservedTrendedValue observedTrendedValue = new ObservedTrendedValue(sensorId, value, receivedAt);
        observedTrendedValue.setObservedAt(observedAt);
        assertEquals(receivedAt, observedTrendedValue.getReceivedAt());
        assertEquals(observedAt, observedTrendedValue.getObservedAt());
    }

    @Test
    void verifyObservedAtUsinParent() {
        SensorId sensorId = mock(SensorId.class);
        int value = 1234;
        Instant observedAt = Instant.now().minusSeconds(5);
        ObservedValue observedValue = new ObservedTrendedValue(sensorId, value);
        observedValue.setObservedAt(observedAt);
        assertEquals(observedAt, observedValue.getObservedAt());
    }
}