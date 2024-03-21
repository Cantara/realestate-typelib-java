package no.cantara.realestate.observations;

import java.time.Instant;

/**
 * {
 *   "sensorId": "9fcc579c-10e2-4241-a28c-1fbf0ad9b5cc",
 *   "realEstate": "RE1",
 *   "building": null,
 *   "floor": "4",
 *   "servesRoom": null,
 *   "placementRoom": "4101",
 *   "climateZone": "1",
 *   "sensorType": "temp",
 *   "measurementUnit": "C",
 *   "observedValue": 22,
 *   "observedAt": "2021-01-26T18:01:38Z"
 * }
 */
public class ObservationMessage implements Cloneable {

    private String sensorId;
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
    private Number value;
    private Instant observationTime;
    private Instant receivedAt;

    public ObservationMessage() {
    }

    public ObservationMessage(String sensorId, String tfm, String realEstate, String building, String floor, String section, String servesRoom, String placementRoom, String climateZone, String electricityZone, String name, String sensorType, String measurementUnit) {
        this.sensorId = sensorId;
        this.tfm = tfm;
        this.realEstate = realEstate;
        this.building = building;
        this.floor = floor;
        this.section = section;
        this.servesRoom = servesRoom;
        this.placementRoom = placementRoom;
        this.climateZone = climateZone;
        this.electricityZone = electricityZone;
        this.name = name;
        this.sensorType = sensorType;
        this.measurementUnit = measurementUnit;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getTfm() {
        return tfm;
    }

    public void setTfm(String tfm) {
        this.tfm = tfm;
    }

    public String getRealEstate() {
        return realEstate;
    }

    public void setRealEstate(String realEstate) {
        this.realEstate = realEstate;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getServesRoom() {
        return servesRoom;
    }

    public void setServesRoom(String servesRoom) {
        this.servesRoom = servesRoom;
    }

    public String getPlacementRoom() {
        return placementRoom;
    }

    public void setPlacementRoom(String placementRoom) {
        this.placementRoom = placementRoom;
    }

    public String getClimateZone() {
        return climateZone;
    }

    public void setClimateZone(String climateZone) {
        this.climateZone = climateZone;
    }

    public String getElectricityZone() {
        return electricityZone;
    }

    public void setElectricityZone(String electricityZone) {
        this.electricityZone = electricityZone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    public Instant getObservationTime() {
        return observationTime;
    }

    public void setObservationTime(Instant observationTime) {
        this.observationTime = observationTime;
    }

    public Instant getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(Instant receivedAt) {
        this.receivedAt = receivedAt;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ObservationMessage{" +
                "sensorId='" + sensorId + '\'' +
                ", tfm='" + tfm + '\'' +
                ", realEstate='" + realEstate + '\'' +
                ", building='" + building + '\'' +
                ", floor='" + floor + '\'' +
                ", section='" + section + '\'' +
                ", servesRoom='" + servesRoom + '\'' +
                ", placementRoom='" + placementRoom + '\'' +
                ", climateZone='" + climateZone + '\'' +
                ", electricityZone='" + electricityZone + '\'' +
                ", name='" + name + '\'' +
                ", sensorType='" + sensorType + '\'' +
                ", measurementUnit='" + measurementUnit + '\'' +
                ", value=" + value +
                ", observationTime=" + observationTime +
                ", receivedAt=" + receivedAt +
                '}';
    }
}
