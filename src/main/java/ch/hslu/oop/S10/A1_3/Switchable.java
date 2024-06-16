package ch.hslu.oop.S10.A1_3;

import java.beans.PropertyChangeEvent;

/**
 * Ermöglicht das Ein- und Ausschalten von Objekten und kann ihre Status auch überprüfen.
 */
public interface Switchable {
    void switchOn();
    void switchOff();
    boolean isSwitchedOn();
    boolean isSwitchedOff();
}