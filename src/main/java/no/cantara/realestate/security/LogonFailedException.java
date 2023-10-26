package no.cantara.realestate.security;

import no.cantara.realestate.RealEstateException;

public class LogonFailedException extends RealEstateException {
    public LogonFailedException(String msg) {
        super(msg);
    }

    public LogonFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
