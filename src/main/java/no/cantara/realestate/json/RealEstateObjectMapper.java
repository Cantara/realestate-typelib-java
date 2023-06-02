package no.cantara.realestate.json;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class RealEstateObjectMapper {
    private static final Logger log = getLogger(RealEstateObjectMapper.class);
    private static RealEstateObjectMapper instance;
    private final ObjectMapper objectMapper;

    private RealEstateObjectMapper() {
//        objectMapper = new ObjectMapper().configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false).configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).enable(new JsonParser.Feature[]{JsonReadFeature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER.mappedFeature()}).findAndRegisterModules();
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.setDateFormat(new StdDateFormat().withColonInTimeZone(true));
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
    }

    public static RealEstateObjectMapper getInstance() {
        if (instance == null) {
            instance = new RealEstateObjectMapper();
        }
        return instance;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
