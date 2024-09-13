package no.cantara.realestate.plugins.distribution;

import no.cantara.realestate.observations.ObservationMessage;

import java.time.Instant;
import java.util.Properties;

public interface DistributionService {

    String getName();

    void initialize(Properties config);
    void publish(ObservationMessage observationMessage);

    boolean isInitialized();
    boolean isHealthy();

    long getNumberOfMessagesPublished();
    long getNumberOfMessagesFailed();
    Instant getWhenLastMessageDistributed();
}
