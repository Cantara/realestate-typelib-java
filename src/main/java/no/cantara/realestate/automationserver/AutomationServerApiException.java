package no.cantara.realestate.automationserver;

import no.cantara.realestate.ExceptionStatusType;
import no.cantara.realestate.RealEstateException;

public class AutomationServerApiException extends RealEstateException {
    public AutomationServerApiException(String message) {
        super(message);
    }

    public AutomationServerApiException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public AutomationServerApiException(String message, Throwable throwable, Object... parameters) {
        super(message, throwable, parameters);
    }

    public AutomationServerApiException(String msg, Exception e, ExceptionStatusType statusType) {
        super(msg, e, statusType);
    }

    public AutomationServerApiException(String msg, ExceptionStatusType statusType) {
        super(msg, statusType);
    }

    public AutomationServerApiException(String msg, Throwable t, ExceptionStatusType statusType) {
        super(msg, t, statusType);
    }
}
