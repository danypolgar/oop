package ch.hslu.oop.S10.A1_3;

import java.util.EventObject;

public class TemperaturMinEvent extends EventObject {

    private final double min;
    /**
     * Constructs a prototypical Event.
     *
     * @param source the object on which the Event initially occurred
     * @param min
     * @throws IllegalArgumentException if source is null
     */
    public TemperaturMinEvent(Object source, double min) {
        super(source);
        this.min = min;
    }

    public double getMin() {
        return min;
    }
}
