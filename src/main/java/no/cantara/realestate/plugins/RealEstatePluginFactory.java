package no.cantara.realestate.plugins;

import no.cantara.realestate.RealEstateException;
import no.cantara.realestate.plugins.config.PluginConfig;
import no.cantara.realestate.plugins.distribution.DistributionService;
import no.cantara.realestate.plugins.ingestion.IngestionService;
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
     *
     * @return
     * @throws RealEstateException if the plugin is not configured correctly. Please call initialize() first.
     */
    List<IngestionService> createIngestionServices() throws RealEstateException;

    /**
     *
     * @return
     * @throws RealEstateException if the plugin is not configured correctly. Please call initialize() first.
     */
    List<DistributionService> createDistributionServices() throws RealEstateException;




}
