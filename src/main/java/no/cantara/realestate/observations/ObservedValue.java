package no.cantara.realestate.observations;

import no.cantara.realestate.sensors.SensorId;

import java.time.Instant;

public class ObservedValue {
    private final SensorId sensorId;
    private final Number value;
    private final Instant receivedAt;
    private Instant observedAt;
    private String payloadJson;

    private Boolean isReliable = null;

    public ObservedValue(SensorId sensorId, Number value) {
        this(sensorId, value, Instant.now());
    }
    public ObservedValue(SensorId sensorId, Number value, Instant receivedAt) {
        this.sensorId = sensorId;
        this.value = value;
        this.receivedAt = receivedAt;
    }

    public SensorId getSensorId() {
        return sensorId;
    }

    public Number getValue() {
        return value;
    }

    public Instant getReceivedAt() {
        return receivedAt;
    }

    public Instant getObservedAt() {
        return observedAt;
    }

    public void setObservedAt(Instant observedAt) {
        this.observedAt = observedAt;
    }

    public String getPayloadJson() {
        return payloadJson;
    }

    public void setPayloadJson(String payloadJson) {
        this.payloadJson = payloadJson;
    }

    public void setReliable(boolean isReliable) {
        this.isReliable = isReliable;
    }

    public Boolean getIsReliable() {
        return isReliable;
    }

    @Override
    public String toString() {
        return "ObservedValue{" +
                "sensorId=" + sensorId +
                ", value=" + value +
                ", receivedAt=" + receivedAt +
                ", observedAt=" + observedAt +
                ", payloadJson='" + payloadJson + '\'' +
                ", isReliable=" + isReliable +
                '}';
    }
}
