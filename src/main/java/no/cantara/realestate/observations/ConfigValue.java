package no.cantara.realestate.observations;

import no.cantara.realestate.SensorId;

import java.time.Instant;

public abstract class ConfigValue<T> {
    private final SensorId sensorId;
    private final String value;
    private final Instant receivedAt;
    private Instant observedAt;
    private String payloadJson;

    public ConfigValue(SensorId sensorId, String value) {
        this(sensorId, value, Instant.now());
    }

    public ConfigValue(SensorId sensorId, String value, Instant receivedAt) {
        this.sensorId = sensorId;
        this.value = value;
        this.receivedAt = receivedAt;
    }

    public SensorId getSensorId() {
        return sensorId;
    }

    public String getValue() {
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

    @Override
    public String toString() {
        return "ConfigValue{" +
                "sensorId=" + sensorId +
                ", value='" + value + '\'' +
                ", receivedAt=" + receivedAt +
                ", observedAt=" + observedAt +
                ", payloadJson='" + payloadJson + '\'' +
                '}';
    }
}
