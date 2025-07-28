package no.cantara.realestate.sensors.desigo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesigoSensorIdTest {

    @Test
    void testConstructors() {
        DesigoSensorId desigoSensorId =  new DesigoSensorId(null, "desigoId1", "propertyId1");
        DesigoSensorId desigoSensorIdSame =  new DesigoSensorId("SensorId1","desigoId1", "propertyId1");
        assertFalse(desigoSensorId.equals(desigoSensorIdSame));
        desigoSensorId.setId("SensorId1");
        assertTrue(desigoSensorId.equals(desigoSensorIdSame));
        assertEquals(desigoSensorId.hashCode(), desigoSensorIdSame.hashCode());

    }

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