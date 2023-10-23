package no.cantara.realestate.plugins.ingestion;

import no.cantara.realestate.SensorId;
import no.cantara.realestate.observations.ObservationListener;

import java.util.List;
import java.util.Properties;

public interface IngestionService {


    String getName();

    boolean initialize(Properties config);

    void openConnection(ObservationListener observationListener);
    void closeConnection();

    void addSubscriptions(List<SensorId> sensorIds);
    void addSubscription(SensorId sensorId);
    void removeSubscription(SensorId sensorId);
    long getSubscriptionsCount();


    boolean isInitialized();
    boolean isHealthy();

    long getNumberOfMessagesImported();
    long getNumberOfMessagesFailed();
}
