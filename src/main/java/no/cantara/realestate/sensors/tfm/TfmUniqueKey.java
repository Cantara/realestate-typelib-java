package no.cantara.realestate.sensors.tfm;


import no.cantara.realestate.sensors.UniqueKey;

public class TfmUniqueKey implements UniqueKey<Tfm> {
    private final Tfm tfm;

    public TfmUniqueKey(Tfm tfm) {
        this.tfm = tfm;
    }

    public Tfm getKey() {
        return tfm;
    }
}
