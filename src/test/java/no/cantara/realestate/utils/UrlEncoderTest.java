package no.cantara.realestate.utils;

import org.junit.jupiter.api.Test;

import static no.cantara.realestate.utils.UrlEncoder.urlEncode;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UrlEncoderTest {

    @Test
    void name() {
        assertEquals("hi%20on%20you", urlEncode("hi on you"));
    }
}