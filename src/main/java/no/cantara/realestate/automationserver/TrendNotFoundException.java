package no.cantara.realestate.automationserver;

import no.cantara.realestate.RealEstateException;

public class TrendNotFoundException extends RealEstateException {
    private String trendId;
    public TrendNotFoundException(String message) {
        super(message);
    }

    public TrendNotFoundException(String message, String trendId) {
        super(message);
        this.trendId = trendId;
    }

    public String getTrendId() {
        return trendId;
    }

    public void setTrendId(String trendId) {
        this.trendId = trendId;
    }

    @Override
    public String toString() {
        return "TrendNotFoundException{" +
                "trendId='" + trendId + '\'' +
                "} " + super.toString();
    }
}
