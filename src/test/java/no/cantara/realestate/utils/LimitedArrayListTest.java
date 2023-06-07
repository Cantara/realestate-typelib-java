package no.cantara.realestate.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LimitedArrayListTest {

    @Test
    void verifyMaxSize() {
        LimitedArrayList<String> list = new LimitedArrayList<>(1);
        assertEquals(list.size(), 0);
        list.add("1");
        assertEquals(list.size(),1);
        list.add("2");
        assertEquals(list.size(),1);
        assertEquals("2", list.get(0));
    }
}