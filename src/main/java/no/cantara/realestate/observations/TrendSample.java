package no.cantara.realestate.observations;

import java.time.Instant;
import java.util.Objects;

/*
    {
		"value": {
			"value": 9398.001,
			"units": "https://metasysserver/api/v4/enumSets/507/members/19"
		},
		"timestamp": "2020-09-16T05:20:00Z",
		"isReliable": true
	},
 */
public class TrendSample {
    private String trendId = null;

    private Boolean isReliable;
    private Instant observedAt;
    private Number value;
    private String sensorId;

    public TrendSample() {
    }

    public String getTrendId() {
        return trendId;
    }

    public void setTrendId(String trendId) {
        this.trendId = trendId;
    }


    public Boolean getReliable() {
        return isReliable;
    }

    public void setReliable(Boolean reliable) {
        isReliable = reliable;
    }

    public void setIsReliable(Boolean reliable) {
        isReliable = reliable;
    }



    public void setObservedAt(String timestamp) {
//        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
//        LocalDate parsedDate = LocalDate.parse(timestamp, formatter);
        this.observedAt = Instant.parse(timestamp);
    }

    public boolean isValid() {
        if (trendId == null || trendId.isEmpty())
            return false;
        if (value == null)
            return false;
        return true;
    }

    public Instant getObservedAt() {
        return observedAt;
    }

    public void setObservedAt(Instant observedAt) {
        this.observedAt = observedAt;
    }

    public Number getValue() {
        return value;
    }

    public void setValue(Number value) {
        this.value = value;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorId() {
        return sensorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrendSample that = (TrendSample) o;
        return Objects.equals(getTrendId(), that.getTrendId()) && Objects.equals(isReliable, that.isReliable) && Objects.equals(getObservedAt(), that.getObservedAt()) && Objects.equals(getValue(), that.getValue()) && Objects.equals(getSensorId(), that.getSensorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTrendId(), isReliable, getObservedAt(), getValue(), getSensorId());
    }

    @Override
    public String toString() {
        return "TrendSample{" +
                "trendId='" + trendId + '\'' +
                ", isReliable=" + isReliable +
                ", observedAt=" + observedAt +
                ", value=" + value +
                ", sensorId='" + sensorId + '\'' +
                '}';
    }
}
