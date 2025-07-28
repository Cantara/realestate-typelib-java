package no.cantara.realestate.sensors.desigo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DesigoSensorIdTest {

    @Test
    void testEquals() {
        DesigoSensorId desigoSensorId =  new DesigoSensorId("SensorId1","desigoId1", "propertyId1");
        DesigoSensorId desigoSensorIdSame =  new DesigoSensorId("SensorId1","desigoId1", "propertyId1");
        assertTrue(desigoSensorId.equals(desigoSensorIdSame));
        assertEquals(desigoSensorId.hashCode(), desigoSensorIdSame.hashCode());

    }

    @Test
    void testEqualsWithTrendId() {
        DesigoSensorId desigoSensorId =  new DesigoSensorId("SensorId1","desigoId1", "propertyId1");
        desigoSensorId.setTrendId("trendId1");
        DesigoSensorId desigoSensorIdSame =  new DesigoSensorId("SensorId1","desigoId1", "propertyId1");
        assertTrue(desigoSensorId.equals(desigoSensorIdSame));
        assertEquals(desigoSensorId.hashCode(), desigoSensorIdSame.hashCode());

    }
}