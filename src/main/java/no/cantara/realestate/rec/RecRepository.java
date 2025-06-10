package no.cantara.realestate.rec;

import no.cantara.realestate.sensors.SensorId;
import no.cantara.realestate.sensors.SensorSystem;
import no.cantara.realestate.sensors.SensorSystemId;

import java.util.List;
import java.util.Map;

public interface RecRepository {
    void addRecTags(SensorId sensorId, RecTags tags);

    List<RecTags> getRecTagsByTwinId(String twinId);

    RecTags getRecTagsBySensorId(SensorId sensorId);

    List<RecTags> findBySensorSystem(SensorSystem sensorSystem);

    List<RecTags> findBySensorSystemId(SensorSystemId sensorSystemId);

    long size();
    Map<SensorId,RecTags> getAll();
}
