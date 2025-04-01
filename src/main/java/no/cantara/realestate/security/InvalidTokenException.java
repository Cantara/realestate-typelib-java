package no.cantara.realestate.security;

import no.cantara.realestate.RealEstateException;

public class InvalidTokenException extends RealEstateException {
    public InvalidTokenException(String msg) {
        super(msg);
    }

    public InvalidTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
