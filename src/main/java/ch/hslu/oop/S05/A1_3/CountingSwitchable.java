package ch.hslu.oop.S05.A1_3;

public class CountingSwitchable extends AbstractSwitch {

    private int count = 0;
    @Override
    public void switchOn() {
        this.count++;
        setSwitchedOn(true);
    }

    @Override
    public void switchOff() {
        this.count++;
        setSwitchedOn(false);
    }

    public int getCount() {
        return count;
    }
}