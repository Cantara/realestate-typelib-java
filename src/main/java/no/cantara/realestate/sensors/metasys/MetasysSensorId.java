package no.cantara.realestate.sensors.metasys;


import no.cantara.realestate.sensors.SensorId;

import static no.cantara.realestate.sensors.SensorSystem.metasys;

public class MetasysSensorId extends SensorId {

    public static final String METASYS_OBJECT_ID = "metasysObjectId";
    public static final String METASYS_OBJECT_REFERENCE = "metasysObjectReference";

   public MetasysSensorId(String twinId, String metasysObjectId) {
        this(twinId, metasysObjectId, null);
    }

    public MetasysSensorId(String twinId, String metasysObjectId, String metasysObjectReference) {
       super(twinId);
        setSensorSystem(metasys);
        addIdentifier(METASYS_OBJECT_ID, metasysObjectId);
        addIdentifier(METASYS_OBJECT_REFERENCE, metasysObjectReference);
    }

    public String getMetasysObjectId() {
        return getIdentifier(METASYS_OBJECT_ID);
    }

    public String getMetasysObjectReference() {
        return getIdentifier(METASYS_OBJECT_REFERENCE);
    }

    public MetasysUniqueKey getMappingKey() {
        return new MetasysUniqueKey(getMetasysObjectId());
    }


}
