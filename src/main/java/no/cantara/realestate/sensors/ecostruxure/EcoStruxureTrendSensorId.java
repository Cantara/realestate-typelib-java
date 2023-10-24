package no.cantara.realestate.sensors.ecostruxure;


import no.cantara.realestate.sensors.SensorId;

public class EcoStruxureTrendSensorId extends SensorId {

    private final String trendId;
    private String objectName;
    private String objectId;

    public EcoStruxureTrendSensorId(String trendId) {
        this.trendId = trendId;
    }

    public String getTrendId() {
        return trendId;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public EcoStruxureTrendUniqueKey getMappingKey() {
        return new EcoStruxureTrendUniqueKey(trendId);
    }


}
