package no.cantara.realestate.importer;

import no.cantara.realestate.sensors.MappedSensorId;
import no.cantara.realestate.sensors.SensorId;
import no.cantara.realestate.sensors.SensorSystem;

import java.util.List;

public interface SensorImporter {

    List<SensorId> importSensors(String sourceType);
    List<SensorId> importSensorIds(SensorSystem sensorSystem);
    List<MappedSensorId> importMappedId(String sourceType);
}
