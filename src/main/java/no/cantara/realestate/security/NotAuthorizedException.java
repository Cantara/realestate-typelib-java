package no.cantara.realestate.security;

import no.cantara.realestate.RealEstateException;

public class NotAuthorizedException extends RealEstateException {
    private String userId;
    public NotAuthorizedException(String message) {
        super(message);
    }

    public NotAuthorizedException(String message, String userId) {
        super(message);
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "NotAuthorizedException{" +
                "userId='" + userId + '\'' +
                "} " + super.toString();
    }
}
