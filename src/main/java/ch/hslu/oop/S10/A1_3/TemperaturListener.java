package ch.hslu.oop.S10.A1_3;

import java.util.EventListener;

public interface TemperaturListener extends EventListener {

    void onMaxValueChanged(TemperaturMaxEvent event);
    void onMinValueChanged(TemperaturMinEvent event);
}
