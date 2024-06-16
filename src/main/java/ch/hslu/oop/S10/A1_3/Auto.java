package ch.hslu.oop.S10.A1_3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Auto implements PropertyChangeListener {

    private final Motor motor;

    private final Licht licht;

    public Auto(Motor motor, Licht licht) {
        this.motor = motor;
        this.licht = licht;
        this.motor.addPropertyChangeListener(this::handleMotorEvent);
        this.licht.addPropertyChangeListener(this::handleLichtEvent);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if(evt.getSource() == this.motor) {
            handleMotorEvent(evt);
        }
        if(evt.getSource() == this.licht) {
            handleLichtEvent(evt);
        }
    }

    public Motor getMotor() {
        return motor;
    }

    public Licht getLicht() {
        return licht;
    }

    private void handleLichtEvent(PropertyChangeEvent evt) {
        System.out.printf("Licht: %s%n", evt.getNewValue());
    }

    private void handleMotorEvent(PropertyChangeEvent evt) {
        System.out.printf("Motor: %s%n", evt.getNewValue());
    }
}
