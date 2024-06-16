package ch.hslu.oop.S08.A1_3;

import java.awt.*;

public enum Aggregatszustand {
    SOLID("fest"),
    LIQUID("flüssig"),
    GAS("gasförmig"),
    ;

    private final String label;

    Aggregatszustand(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
