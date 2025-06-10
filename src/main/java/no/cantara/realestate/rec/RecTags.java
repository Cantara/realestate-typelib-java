package no.cantara.realestate.rec;

public class RecTags {

    private String twinId;
    private String name;
    private String realEstate;
    private String building;
    private String floor;

    private String section;
    private String placementRoom;
    private String servesRoom;
    private String climateZone;
    private String electricityZone;
    private String sensorType;
    private String sensorSystem;
    private String sensorId;
    private String tfm;
    private String measurementUnit;


    public RecTags() {
    }

    public RecTags(String twinId) {
        this.twinId = twinId;
    }

    public String getTwinId() {
        return twinId;
    }

    public void setTwinId(String twinId) {
        this.twinId = twinId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPlacementRoom() {
        return placementRoom;
    }

    public void setPlacementRoom(String placementRoom) {
        this.placementRoom = placementRoom;
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

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorSystem() {
        return sensorSystem;
    }

    public void setSensorSystem(String sensorSystem) {
        this.sensorSystem = sensorSystem;
    }

    public String getTfm() {
        return tfm;
    }

    public void setTfm(String tfm) {
        this.tfm = tfm;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    /**
     *
     * @param tag
     * @return
     * @throws IllegalArgumentException if tag is not a valid name
     */
    public String getTagValue(String tag) {
        switch (tag) {
            case "recId":
            case "twinId":
            case "id":
                return twinId;
            case "realEstate":
                return realEstate;
            case "building":
                return building;
            case "floor":
                return floor;
            case "placementRoom":
                return placementRoom;
            case "servesRoom":
                return servesRoom;
            case "climateZone":
                return climateZone;
            case "electricityZone":
                return electricityZone;
            case "section":
                return section;
            case "sensorType":
                return sensorType;
            case "sensorSystem":
                return sensorSystem;
            case "sensorId":
                return sensorId;
            default:
                throw new IllegalArgumentException("Unknown property: " + tag);
        }
    }

    @Override
    public String toString() {
        return "RecTags{" +
                "building='" + building + '\'' +
                ", twinId='" + twinId + '\'' +
                ", name='" + name + '\'' +
                ", realEstate='" + realEstate + '\'' +
                ", floor='" + floor + '\'' +
                ", section='" + section + '\'' +
                ", placementRoom='" + placementRoom + '\'' +
                ", servesRoom='" + servesRoom + '\'' +
                ", climateZone='" + climateZone + '\'' +
                ", electricityZone='" + electricityZone + '\'' +
                ", sensorType='" + sensorType + '\'' +
                ", sensorSystem='" + sensorSystem + '\'' +
                ", sensorId='" + sensorId + '\'' +
                ", tfm='" + tfm + '\'' +
                ", measurementUnit='" + measurementUnit + '\'' +
                '}';
    }
}
