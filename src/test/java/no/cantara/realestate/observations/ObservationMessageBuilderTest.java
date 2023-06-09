package no.cantara.realestate.observations;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ObservationMessageBuilderTest {

    /**
     * {
     *   "recId": "9fcc579c-10e2-4241-a28c-1fbf0ad9b5cc",
     *   "realEstate": "RE1",
     *   "building": null,
     *   "floor": "4",
     *   "servesRoom": null,
     *   "placementRoom": "4101",
     *   "climateZone": "1",
     *   "sensorType": "temp",
     *   "measurementUnit": "C",
     *   "observedValue": 22,
     *   "observedAt": "2021-01-26T18:01:38Z"
     * }
     */
    @Test
    void buildAll() {
        Instant observedAt = Instant.now().minusSeconds(10);
        Instant receivedAt = Instant.now();
        ObservationMessage observationMessage = new ObservationMessageBuilder()
                .withSensorId("rec1")
                .withRealEstate("RE1")
                .withBuilding("Building1")
                .withFloor("04")
                .withSection("Section West")
                .withServesRoom("Room1")
                .withPlacementRoom("Room21")
                .withClimateZone("air1")
                .withElectricityZone("light")
                .withSensorType("temp")
                .withMeasurementUnit("C")
                .withValue(22)
                .withObservationTime(observedAt)
                .withReceivedAt(receivedAt)
                .withTfm("TFM12345")
                .build();
        assertNotNull(observationMessage);
        assertEquals("rec1", observationMessage.getSensorId());
        assertEquals("RE1", observationMessage.getRealEstate());
        assertEquals("Building1", observationMessage.getBuilding());
        assertEquals("04", observationMessage.getFloor());
        assertEquals("Section West", observationMessage.getSection());
        assertEquals("Room1", observationMessage.getServesRoom());
        assertEquals("Room21", observationMessage.getPlacementRoom());
        assertEquals("air1", observationMessage.getClimateZone());
        assertEquals("light", observationMessage.getElectricityZone());
        assertEquals("temp", observationMessage.getSensorType());
        assertEquals("C", observationMessage.getMeasurementUnit());
        assertEquals(22, observationMessage.getValue());
        assertEquals(observedAt.toString(),observationMessage.getObservationTime().toString());
        assertEquals(receivedAt.toString(), observationMessage.getReceivedAt().toString());
        assertEquals("TFM12345", observationMessage.getTfm());

    }
}