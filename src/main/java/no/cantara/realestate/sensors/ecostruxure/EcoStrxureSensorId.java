package no.cantara.realestate.sensors.ecostruxure;

import no.cantara.realestate.sensors.SensorId;
import no.cantara.realestate.sensors.SensorSystem;

public class EcoStrxureSensorId extends SensorId {

    public static final String OBJECT_ID = "objectId";
    public static final String OBJECT_NAME = "objectName";

    public EcoStrxureSensorId(String objectId, String objectName) {
        setSensorSystem(SensorSystem.ecostructure);
        addIdentifier(OBJECT_ID, objectId);
        addIdentifier(OBJECT_NAME, objectName);
    }
}
