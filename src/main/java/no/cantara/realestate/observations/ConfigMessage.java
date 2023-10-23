package no.cantara.realestate.observations;

import no.cantara.realestate.SensorId;

import java.time.Instant;

public class ConfigMessage {
    private SensorId sensorId;
    private String message;
    private final Instant receivedAt;
    private Instant observedAt;
    private String payloadJson;

    public ConfigMessage(SensorId sensorId, String value) {
        this.sensorId = sensorId;
        this.message = value;
        this.receivedAt = Instant.now();
    }

    public SensorId getSensorId() {
        return sensorId;
    }

    public void setSensorId(SensorId sensorId) {
        this.sensorId = sensorId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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
        return "ConfigMessage{" +
                "sensorId=" + sensorId +
                ", message='" + message + '\'' +
                ", receivedAt=" + receivedAt +
                ", observedAt=" + observedAt +
                ", payloadJson='" + payloadJson + '\'' +
                '}';
    }
}
