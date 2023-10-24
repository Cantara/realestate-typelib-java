package no.cantara.realestate.sensors.desigo;


import no.cantara.realestate.sensors.UniqueKey;

import java.util.Objects;

public class DesigoUniqueKey implements UniqueKey<String> {

    private String desigoId;
    private String propertyId;

    public DesigoUniqueKey(String desigoId, String propertyId) {
        this.desigoId = desigoId;
        this.propertyId = propertyId;
    }

    @Override
    public String getKey() {
        return desigoId + "." + propertyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DesigoUniqueKey that = (DesigoUniqueKey) o;
        return Objects.equals(desigoId, that.desigoId) && Objects.equals(propertyId, that.propertyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desigoId, propertyId);
    }

    @Override
    public String toString() {
        return "DesigoUniqueKey{" +
                "desigoId='" + desigoId + '\'' +
                ", propertyId='" + propertyId + '\'' +
                ", key='" + getKey() + '\'' +
                '}';
    }
}
