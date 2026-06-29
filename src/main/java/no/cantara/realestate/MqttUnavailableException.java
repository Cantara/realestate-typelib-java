package no.cantara.realestate;

/**
 * Typed exception for when:
 * - connection is not established
 * - connection is unstable
 * - quota is exceeded.
 */
public class MqttUnavailableException extends  RealEstateException {
    public MqttUnavailableException(String message) {
        super(message);
    }

    public MqttUnavailableException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public MqttUnavailableException(String message, Throwable throwable, Object... parameters) {
        super(message, throwable, parameters);
    }

    public MqttUnavailableException(String msg, Exception e, ExceptionStatusType statusType) {
        super(msg, e, statusType);
    }

    public MqttUnavailableException(String msg, ExceptionStatusType statusType) {
        super(msg, statusType);
    }

    public MqttUnavailableException(String msg, Throwable t, ExceptionStatusType statusType) {
        super(msg, t, statusType);
    }
}
