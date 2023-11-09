package no.cantara.realestate.plugins;

import no.cantara.realestate.RealEstateException;
import no.cantara.realestate.observations.ObservationListener;
import no.cantara.realestate.plugins.config.PluginConfig;
import no.cantara.realestate.plugins.distribution.DistributionService;
import no.cantara.realestate.plugins.ingestion.IngestionService;
import no.cantara.realestate.plugins.notifications.NotificationListener;
import no.cantara.realestate.plugins.sensormapping.PluginSensorMappingImporter;

import java.util.List;

public interface RealEstatePluginFactory {



    /**
     * The id of the plugin. This is used as Prefix for the configuration
     * @return
     */
    String getId();
    String getDisplayName();
    String getDescription();

    void initialize(PluginConfig config);

    /**
     *
     * @return
     * @throws RealEstateException if the plugin is not configured correctly. Please call initialize() first.
     */
    PluginSensorMappingImporter createSensorMappingImporter() throws RealEstateException;

    /**
     * Create the ingestion services for this plugin. The ingestion services are responsible for reading data from the Building Automation Server (BAS)
     * @param observationListener
     * @param notificationListener
     * @return List of observationServices
     * @throws RealEstateException if the plugin is not configured correctly. Please call initialize() first.
     */
    List<IngestionService> createIngestionServices(ObservationListener observationListener, NotificationListener notificationListener) throws RealEstateException;

    /**
     *
     * @return
     * @throws RealEstateException if the plugin is not configured correctly. Please call initialize() first.
     */
    List<DistributionService> createDistributionServices() throws RealEstateException;




}
