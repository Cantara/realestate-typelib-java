package no.cantara.realestate.sensors.desigo;


import no.cantara.realestate.sensors.SensorId;
import no.cantara.realestate.sensors.SensorSystemId;

import java.util.List;

import static no.cantara.realestate.sensors.SensorSystem.desigo;

public class DesigoSensorId extends SensorId implements SensorSystemId {

    public static final String DESIGO_ID = "desigoId";
    public static final String DESIGO_PROPERTY_ID = "desigoPropertyId";

    public DesigoSensorId(String twinId, String desigoId, String desigoPropertyId) {
        super(twinId);
        setSensorSystem(desigo);
        addIdentifier(DESIGO_ID, desigoId);
        addIdentifier(DESIGO_PROPERTY_ID, desigoPropertyId);
    }

    public DesigoUniqueKey getMappingKey() {
        return new DesigoUniqueKey(getDesigoId(), getDesigoPropertyId());
    }

    public String getDesigoId() {
        return getIdentifier(DESIGO_ID);
    }

    public String getDesigoPropertyId() {
        return getIdentifier(DESIGO_PROPERTY_ID);
    }


    @Override
    public List<String> getIdentifierKeys() {
        return List.of(DESIGO_ID, DESIGO_PROPERTY_ID);
    }
}
