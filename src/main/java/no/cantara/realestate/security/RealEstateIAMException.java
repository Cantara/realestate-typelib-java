package no.cantara.realestate.security;

import no.cantara.realestate.RealEstateException;

public class RealEstateIAMException extends RealEstateException {
    public RealEstateIAMException(String message) {
        super(message);
    }

    public RealEstateIAMException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
