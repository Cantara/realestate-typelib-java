package no.cantara.realestate.plugins.ingestion;

import no.cantara.realestate.observations.ObservationListener;
import no.cantara.realestate.plugins.config.PluginConfig;
import no.cantara.realestate.plugins.notifications.NotificationListener;
import no.cantara.realestate.sensors.SensorId;

import java.time.Instant;
import java.util.List;

public interface IngestionService {


    String getName();

    boolean initialize(PluginConfig config);

    void openConnection(ObservationListener observationListener, NotificationListener notificationListener);
    void closeConnection();

    void addSubscriptions(List<SensorId> sensorIds);
    void addSubscription(SensorId sensorId);
    void removeSubscription(SensorId sensorId);
    long getSubscriptionsCount();


    boolean isInitialized();
    boolean isHealthy();

    long getNumberOfMessagesImported();
    long getNumberOfMessagesFailed();
    Instant getWhenLastMessageImported();
}
