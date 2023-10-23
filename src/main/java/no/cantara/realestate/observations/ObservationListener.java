package no.cantara.realestate.observations;

public interface ObservationListener {
    void observedValue(ObservedValue observedValue);
    void observedConfigValue(ConfigValue configValue);

    void observedConfigMessage(ConfigMessage configMessage);
}
