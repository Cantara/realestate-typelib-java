package no.cantara.realestate.observations;

import no.cantara.realestate.sensors.SensorType;

import java.time.Instant;
import java.util.Objects;

public class PresentValue {

    private String sensorId;

    private SensorType sensorType;

    private Number value;

    private Instant observedAt;
    private Boolean isReliable;


    public PresentValue() {
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public SensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    public Instant getObservedAt() {
        return observedAt;
    }

    public void setObservedAt(String timestamp) {
//        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
//        LocalDate parsedDate = LocalDate.parse(timestamp, formatter);
        this.observedAt = Instant.parse(timestamp);
    }

    public void setObservedAt(Instant observedAt) {
        this.observedAt = observedAt;
    }

    public Boolean getReliable() {
        return isReliable;
    }

    public void setReliable(Boolean reliable) {
        isReliable = reliable;
    }

    public boolean isValid() {
        if (sensorId == null || sensorId.isEmpty())
            return false;
        if (value == null)
            return false;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PresentValue that = (PresentValue) o;
        return Objects.equals(getSensorId(), that.getSensorId()) && getSensorType() == that.getSensorType() && Objects.equals(getValue(), that.getValue()) && Objects.equals(getObservedAt(), that.getObservedAt()) && Objects.equals(isReliable, that.isReliable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSensorId(), getSensorType(), getValue(), getObservedAt(), isReliable);
    }

    @Override
    public String toString() {
        return "PresentValue{" +
                "sensorId='" + sensorId + '\'' +
                ", sensorType=" + sensorType +
                ", value=" + value +
                ", observedAt=" + observedAt +
                ", isReliable=" + isReliable +
                '}';
    }
}
