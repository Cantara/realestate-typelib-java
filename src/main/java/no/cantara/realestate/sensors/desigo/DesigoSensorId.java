package no.cantara.realestate.sensors.desigo;


import no.cantara.realestate.sensors.SensorId;

import static no.cantara.realestate.sensors.SensorSystem.desigo;

public class DesigoSensorId extends SensorId {

    public static final String DESIGO_ID = "desigoId";
    public static final String DESIGO_PROPERTY_ID = "desigoPropertyId";

    private String trendId;


    public DesigoSensorId(String desigoId, String desigoPropertyId) {
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

    public String getTrendId() {
        return trendId;
    }

    public void setTrendId(String trendId) {
        this.trendId = trendId;
    }

}
