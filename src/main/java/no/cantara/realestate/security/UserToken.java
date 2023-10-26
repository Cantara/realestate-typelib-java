package no.cantara.realestate.security;

import java.time.Instant;

public class UserToken {
    private String accessToken;

    private Instant expires;
    private Instant createdAt;
    private String refreshToken;

    public UserToken() {
        createdAt = Instant.now();
    }
    public UserToken(String accessToken, Instant expires, String refreshToken) {
        this.accessToken = accessToken;
        this.expires = expires;
        this.createdAt = Instant.now();
        this.refreshToken = refreshToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Instant getExpires() {
        return expires;
    }

    public void setExpires(Instant expires) {
        this.expires = expires;
    }

    public int getValidSeconds() {
        return getExpires().compareTo(Instant.now()) ;
    }


    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public boolean tokenNeedRefresh() throws RealEstateIAMException {
        try {
            long validSeconds = getValidSeconds();
            if (validSeconds < 30) {
                return true;
            }
            if (accessToken == null || accessToken.isEmpty()) {
                return true;
            }
        } catch (Exception e) {
            //#11 FIXME NPE for expires
            throw new RealEstateIAMException("Unable to check if token need refresh. This will cause login-attempt on every request to the BAS Server", e);
        }
        return false;
    }

    @Override
    public String toString() {
        return "UserToken{" +
                "accessToken='" + accessToken + '\'' +
                ", expires=" + expires +
                ", validSeconds=" + getValidSeconds() +
                ", createdAt=" + createdAt +
                '}';
    }
}
