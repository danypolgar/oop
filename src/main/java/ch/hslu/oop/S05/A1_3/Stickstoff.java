package ch.hslu.oop.S05.A1_3;

public class Stickstoff extends Element {

    public Stickstoff() {
        super("N", -210, -196);
    }

    @Override
    public String toString() {
        return "GIFTIG: " + super.toString();
    }
}
