package no.cantara.realestate.observations;

import java.time.Instant;

public final class ObservationMessageBuilder {
    private String recId;
    private String tfm;
    private String realEstate;
    private String building;
    private String floor;
    private String section;
    private String servesRoom;
    private String placementRoom;
    private String climateZone;
    private String electricityZone;
    private String name;
    private String sensorType;
    private String measurementUnit;
    private Number observedValue;
    private Instant observedAt;
    private Instant receivedAt;

    public ObservationMessageBuilder() {
    }

    public ObservationMessageBuilder withRecId(String recId) {
        this.recId = recId;
        return this;
    }

    public ObservationMessageBuilder withTfm(String tfm) {
        this.tfm = tfm;
        return this;
    }

    public ObservationMessageBuilder withRealEstate(String realEstate) {
        this.realEstate = realEstate;
        return this;
    }

    public ObservationMessageBuilder withBuilding(String building) {
        this.building = building;
        return this;
    }

    public ObservationMessageBuilder withFloor(String floor) {
        this.floor = floor;
        return this;
    }

    public ObservationMessageBuilder withSection(String section) {
        this.section = section;
        return this;
    }

    public ObservationMessageBuilder withServesRoom(String servesRoom) {
        this.servesRoom = servesRoom;
        return this;
    }

    public ObservationMessageBuilder withPlacementRoom(String placementRoom) {
        this.placementRoom = placementRoom;
        return this;
    }

    public ObservationMessageBuilder withClimateZone(String climateZone) {
        this.climateZone = climateZone;
        return this;
    }

    public ObservationMessageBuilder withElectricityZone(String electricityZone) {
        this.electricityZone = electricityZone;
        return this;
    }

    public ObservationMessageBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ObservationMessageBuilder withSensorType(String sensorType) {
        this.sensorType = sensorType;
        return this;
    }

    public ObservationMessageBuilder withMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
        return this;
    }

    public ObservationMessageBuilder withObservedValue(Number observedValue) {
        this.observedValue = observedValue;
        return this;
    }

    public ObservationMessageBuilder withObservedAt(Instant observedAt) {
        this.observedAt = observedAt;
        return this;
    }

    public ObservationMessageBuilder withReceivedAt(Instant receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    public ObservationMessage build() {
        ObservationMessage observationMessage = new ObservationMessage();
        observationMessage.setSensorId(recId);
        observationMessage.setTfm(tfm);
        observationMessage.setRealEstate(realEstate);
        observationMessage.setBuilding(building);
        observationMessage.setFloor(floor);
        observationMessage.setSection(section);
        observationMessage.setServesRoom(servesRoom);
        observationMessage.setPlacementRoom(placementRoom);
        observationMessage.setClimateZone(climateZone);
        observationMessage.setElectricityZone(electricityZone);
        observationMessage.setName(name);
        observationMessage.setSensorType(sensorType);
        observationMessage.setMeasurementUnit(measurementUnit);
        observationMessage.setValue(observedValue);
        observationMessage.setObservationTime(observedAt);
        observationMessage.setReceivedAt(receivedAt);
        return observationMessage;
    }
}
