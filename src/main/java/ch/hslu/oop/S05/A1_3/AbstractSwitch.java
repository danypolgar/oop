package ch.hslu.oop.S05.A1_3;

public abstract class AbstractSwitch {

    private boolean isSwitchedOn = false;

    public abstract void switchOn();
    public abstract void switchOff();
    public boolean isSwitchedOn() {
        return isSwitchedOn;
    };
    public boolean isSwitchedOff() {
        return !isSwitchedOn;
    };

    protected final void setSwitchedOn(final boolean switchedOn) {
        this.isSwitchedOn = switchedOn;
    }
}

