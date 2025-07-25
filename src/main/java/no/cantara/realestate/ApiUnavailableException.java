package no.cantara.realestate;

public class ApiUnavailableException extends  RealEstateException {
    public ApiUnavailableException(String message) {
        super(message);
    }

    public ApiUnavailableException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public ApiUnavailableException(String message, Throwable throwable, Object... parameters) {
        super(message, throwable, parameters);
    }

    public ApiUnavailableException(String msg, Exception e, ExceptionStatusType statusType) {
        super(msg, e, statusType);
    }

    public ApiUnavailableException(String msg, ExceptionStatusType statusType) {
        super(msg, statusType);
    }

    public ApiUnavailableException(String msg, Throwable t, ExceptionStatusType statusType) {
        super(msg, t, statusType);
    }
}
