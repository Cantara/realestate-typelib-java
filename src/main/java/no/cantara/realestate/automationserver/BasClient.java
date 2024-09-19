package no.cantara.realestate.automationserver;


import no.cantara.realestate.observations.PresentValue;
import no.cantara.realestate.observations.TrendSample;
import no.cantara.realestate.security.LogonFailedException;
import no.cantara.realestate.security.UserToken;
import no.cantara.realestate.sensors.SensorId;

import java.net.URISyntaxException;
import java.time.Instant;
import java.util.Set;

/*
 * This interface is used by the RealEstatePlugin to communicate with the Building Automation System (BAS).
 */
public interface BasClient {


//    Set<? extends TrendSample> findTrendSamples(String bearerToken, String trendId) throws URISyntaxException;

//    Set<? extends TrendSample> findTrendSamples(String trendId, int take, int skip) throws URISyntaxException, LogonFailedException;

    Set<? extends TrendSample> findTrendSamplesByDate(String trendId, int take, int skip, Instant onAndAfterDateTime) throws URISyntaxException, LogonFailedException;

    PresentValue findPresentValue(SensorId sensorId) throws URISyntaxException, LogonFailedException;

    Integer subscribePresentValueChange(String subscriptionId, String objectId) throws URISyntaxException, LogonFailedException;

    void logon() throws LogonFailedException;

    boolean isLoggedIn();

    String getName();

    boolean isHealthy();

    long getNumberOfTrendSamplesReceived();

    UserToken getUserToken();

    UserToken refreshToken() throws LogonFailedException;


}
