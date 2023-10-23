package no.cantara.realestate.plugins.ingestion;

public interface StreamIngestionService extends IngestionService {
    void startStream();
    void stopStream();
}
