package ch.hslu.oop.S04.A1_3;

/**
 * Ermöglicht das Ein- und Ausschalten von Objekten und kann ihre Status auch überprüfen.
 */
public interface Switchable {
    void switchOn();
    void switchOff();
    boolean isSwitchedOn();
    boolean isSwitchedOff();
}