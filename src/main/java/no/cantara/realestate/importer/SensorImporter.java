package no.cantara.realestate.importer;

import no.cantara.realestate.sensors.MappedSensorId;
import no.cantara.realestate.sensors.SensorId;

import java.util.List;

public interface SensorImporter {

    List<SensorId> importSensors(String sourceType);
    List<MappedSensorId> importMappedId(String sourceType);
}
