package no.cantara.realestate.sensors.ecostruxure;


import no.cantara.realestate.sensors.SensorSystem;
import no.cantara.realestate.sensors.TrendId;

public class EcoStruxureTrendSensorId extends TrendId {

    private String objectName;
    private String objectId;

    public EcoStruxureTrendSensorId(String trendId) {
        super(trendId, SensorSystem.ecostructure);
    }

    public String getTrendId() {
        return getId();
    }



    public EcoStruxureTrendUniqueKey getMappingKey() {
        return new EcoStruxureTrendUniqueKey(getTrendId());
    }


}
