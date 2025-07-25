package no.cantara.realestate.security;

import no.cantara.realestate.RealEstateException;

public class UnauthenticatedException extends RealEstateException {
    public UnauthenticatedException(String message) {
        super(message);
    }
}
