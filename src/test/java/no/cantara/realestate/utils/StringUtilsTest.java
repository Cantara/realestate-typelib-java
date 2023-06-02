package no.cantara.realestate.utils;


import org.junit.jupiter.api.Test;

import static no.cantara.realestate.utils.StringUtils.hasValue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest  {

    @Test
    public void testHasValue() {
        assertTrue(hasValue("hi"));
        assertFalse(hasValue(""));
        assertFalse(hasValue(null));
    }
}