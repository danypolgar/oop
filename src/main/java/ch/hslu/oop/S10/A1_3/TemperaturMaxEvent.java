package ch.hslu.oop.S10.A1_3;

import java.util.EventObject;

public class TemperaturMaxEvent extends EventObject {

    private final double max;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @param max
     * @throws IllegalArgumentException if source is null
     */
    public TemperaturMaxEvent(Object source, double max) {
        super(source);
        this.max = max;
    }

    public double getMax() {
        return max;
    }
}
