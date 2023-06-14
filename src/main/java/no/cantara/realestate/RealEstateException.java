package no.cantara.realestate;

import org.slf4j.helpers.MessageFormatter;

import java.util.UUID;

public class RealEstateException extends RuntimeException {
    private final UUID uuid;
    private Enum<ExceptionStatusType> statusType = null;

    public RealEstateException(String message) {
        super(message);
        uuid = UUID.randomUUID();
    }

    public RealEstateException(String message, Throwable throwable) {
        super(message, throwable);
        this.uuid = UUID.randomUUID();
    }

    public RealEstateException(String message, Throwable throwable, Object... parameters) {
        this(MessageFormatter.format(message, parameters).getMessage(),throwable);

    }

    public RealEstateException(String msg, ExceptionStatusType statusType) {
        this(msg);
        this.statusType = statusType;
    }
    public RealEstateException(String msg, Throwable t, ExceptionStatusType statusType) {
        this(msg,t);
        this.statusType = statusType;
    }

    public RealEstateException(String msg, Exception e, ExceptionStatusType statusType) {
        this(msg, e);
        this.statusType = statusType;
    }


    @Override
    public String getMessage() {

        String message = super.getMessage() +" MessageId: " + uuid.toString();
        if (getCause() != null) {
            message = message + "\n\tCause: " + getCause().getMessage();
        }
        return message;
    }

    public String getMessageId() {
        return uuid.toString();
    }


    public Enum<ExceptionStatusType> getStatusType() {
        return statusType;
    }
}

