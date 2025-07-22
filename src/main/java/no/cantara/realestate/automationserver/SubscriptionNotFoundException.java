package no.cantara.realestate.automationserver;

import no.cantara.realestate.RealEstateException;

public class SubscriptionNotFoundException extends RealEstateException {
    private String subscriptionId;

    public SubscriptionNotFoundException(String message) {
        super(message);
    }

    public SubscriptionNotFoundException(String message, String subscriptionId) {
        super(message);
        this.subscriptionId = subscriptionId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    @Override
    public String toString() {
        return "SubscriptionNotFoundException{" +
                "subscriptionId='" + subscriptionId + '\'' +
                "} " + super.toString();
    }
}
