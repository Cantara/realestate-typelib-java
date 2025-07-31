package no.cantara.realestate.metrics;

public interface MetricsDistributionClient {
    void sendMetrics(Metric metric);
    void sendLongValue(String metricName, long value);
    void sendDoubleValue(String metricName, double value);
    void sendStringValue(String metricName, String value);
    void sendBooleanValue(String metricName, boolean value);
}
