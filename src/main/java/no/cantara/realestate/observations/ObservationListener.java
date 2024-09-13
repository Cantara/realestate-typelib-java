package no.cantara.realestate.observations;

import java.time.Instant;

public interface ObservationListener {
    void observedValue(ObservedValue observedValue);
    void observedConfigValue(ConfigValue configValue);

    void observedConfigMessage(ConfigMessage configMessage);
    Instant getWhenLastMessageObserved();
}
