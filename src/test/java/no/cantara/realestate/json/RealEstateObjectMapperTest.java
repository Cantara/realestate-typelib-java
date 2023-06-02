package no.cantara.realestate.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import no.cantara.realestate.observations.ObservationMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class RealEstateObjectMapperTest {

    @Test
    void validateObservationMessage() throws JsonProcessingException {
        String observationMessageJson = """
      {
        "tfm2recId": "9fcc579c-10e2-4241-a28c-1fbf0ad9b5cc",
        "realEstate": "RE1",
        "building": null,
        "floor": "4",
        "servesRoom": null,
        "placementRoom": "4101",
        "climateZone": "1",
        "sensorType": "temp",
        "measurementUnit": "C",
        "observedValue": 22,
        "observedAt": "2021-01-26T18:01:38Z"
      }
     """;
        ObjectMapper objectMapper = RealEstateObjectMapper.getInstance().getObjectMapper();
        ObservationMessage observationMessage = objectMapper.readValue(observationMessageJson, ObservationMessage.class);
        assertNotNull(observationMessage);

    }
}