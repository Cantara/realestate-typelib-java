package no.cantara.realestate.observations;

public class Value {
    private Object value;
    private String units;

    public Value() {

    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }


    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Value{" +
                "value=" + value +
                ", units='" + units + '\'' +
                '}';
    }
}
