package no.cantara.realestate.sensors.desigo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DesigoSensorIdTest {

    @Test
    void testEquals() {
        DesigoSensorId desigoSensorId =  new DesigoSensorId("desigoId1", "propertyId1");
        desigoSensorId.setId("SensorId1");
        desigoSensorId.setTrendId("trend1");
        DesigoSensorId desigoSensorIdSame =  new DesigoSensorId("desigoId1", "propertyId1");
        desigoSensorIdSame.setId("SensorId1");
        desigoSensorIdSame.setTrendId("trend1");
        assertTrue(desigoSensorId.equals(desigoSensorIdSame));
        assertEquals(desigoSensorId.hashCode(), desigoSensorIdSame.hashCode());

    }
}