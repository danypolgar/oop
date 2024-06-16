package ch.hslu.oop.S04.A1_3;

public class Motor implements Switchable {

    boolean isTurnedOn = false;

    @Override
    public void switchOn() {
        isTurnedOn = true;
    }

    @Override
    public void switchOff() {
        isTurnedOn = false;
    }

    @Override
    public boolean isSwitchedOn() {
        return isTurnedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isTurnedOn;
    }
}
