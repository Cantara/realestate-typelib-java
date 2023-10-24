package no.cantara.realestate.csv;

import no.cantara.realestate.RealEstateException;

public class RealEstateCsvException extends RealEstateException {

    public RealEstateCsvException(String message) {
        super(message);
    }

    public RealEstateCsvException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
