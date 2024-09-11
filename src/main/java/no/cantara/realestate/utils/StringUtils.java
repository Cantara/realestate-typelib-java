package no.cantara.realestate.utils;

public class StringUtils {

    public static boolean hasValue(String value) {
        return value != null && !value.isEmpty();
    }

    public static boolean isEmpty(String value) {
        return value == null || value.isEmpty();
    }
}
