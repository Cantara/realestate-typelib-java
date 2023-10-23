package no.cantara.realestate.plugins.distribution;

import no.cantara.realestate.observations.ObservationMessage;

import java.util.Properties;

public interface DistributionService {

    String getName();

    void initialize(Properties config);
    boolean publish(ObservationMessage observationMessage);

    boolean isInitialized();
    boolean isHealthy();

    long getNumberOfMessagesPublished();
    long getNumberOfMessagesFailed();
}
