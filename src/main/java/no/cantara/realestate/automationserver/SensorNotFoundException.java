package no.cantara.realestate.automationserver;

import no.cantara.realestate.RealEstateException;

public class SensorNotFoundException extends RealEstateException {
    private String sensorId;
    public SensorNotFoundException(String message) {
        super(message);
    }

    public SensorNotFoundException(String message, String sensorId) {
        super(message);
        this.sensorId = sensorId;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    @Override
    public String toString() {
        return "SensorNotFoundException{" +
                "sensorId='" + sensorId + '\'' +
                "} " + super.toString();
    }
}
