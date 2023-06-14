package no.cantara.realestate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealEstateExceptionTest {

    @Test
    void getMessageId() {
        RealEstateException e = new RealEstateException("test");
        assertTrue(e.getMessage().contains("test"));
        assertNotNull(e.getMessageId());
    }

    @Test
    void retryPossible() {
        RealEstateException e = new RealEstateException("retry", ExceptionStatusType.RETRY_MAY_FIX_ISSUE);
        assertTrue(e.getMessage().contains("retry"));
        assertEquals(e.getStatusType(), ExceptionStatusType.RETRY_MAY_FIX_ISSUE);
    }
}