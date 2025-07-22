package no.cantara.realestate.automationserver;

import no.cantara.realestate.RealEstateException;

public class PresentValueNotFoundException extends RealEstateException {
    private String sensorId;
    public PresentValueNotFoundException(String message) {
        super(message);
    }

    public PresentValueNotFoundException(String message, String sensorId) {
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
