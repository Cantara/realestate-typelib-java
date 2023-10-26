package no.cantara.realestate.plugins.notifications;

public interface NotificationListener {

    /**
     *
     * @param pluginId
     * @param service
     * @param warningMessage
     */
    void sendWarning(String pluginId, String service, String warningMessage) ;

    /**
     *
     * @param pluginId
     * @param service
     * @param alarmMessage
     */
    void sendAlarm(String pluginId, String service, String alarmMessage);

    /**
     *
     * @param pluginId
     * @param service
     */
    void clearService(String pluginId,String service);

    void setHealthy(String pluginId, String service);
    void setUnhealthy(String pluginId, String service, String description);

    void addError(String pluginId, String service, String description);
}
