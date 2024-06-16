package ch.hslu.oop.S10.A1_3;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Motor implements Switchable {

    boolean isTurnedOn = false;
    private Status status = Status.AUS;
    private final List<PropertyChangeListener> listeners = new ArrayList<>();

    @Override
    public void switchOn() {
        if (!isTurnedOn) {
            isTurnedOn = true;
            status = Status.EIN;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "state", Status.AUS, Status.EIN);
            firePropertyChange(event);
        }
    }

    @Override
    public void switchOff() {
        if(isTurnedOn) {
            isTurnedOn = false;
            status = Status.AUS;
            final PropertyChangeEvent event = new PropertyChangeEvent(this, "state", Status.EIN, Status.AUS);
            firePropertyChange(event);
        }
    }

    @Override
    public boolean isSwitchedOn() {
        return isTurnedOn;
    }

    @Override
    public boolean isSwitchedOff() {
        return !isTurnedOn;
    }
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        listeners.add(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        listeners.remove(listener);
    }

    private void firePropertyChange(PropertyChangeEvent event) {
        for (final PropertyChangeListener listener : listeners) {
            listener.propertyChange(event);
        }
    }
}
