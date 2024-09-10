package no.cantara.realestate.sensors;

import java.util.function.Predicate;

public class SensorIdQuery {

    private final Predicate<SensorId> predicate;

    public SensorIdQuery(Predicate<SensorId> predicate) {
        this.predicate = predicate;
    }

    public Predicate<SensorId> getPredicate() {
        return predicate;
    }
}
