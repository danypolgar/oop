package ch.hslu.oop.S10.A1_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.List;
import java.util.stream.Collectors;

public class TemperaturVerlauf {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainTemperatur.class);
    private final List<Temperatur> temperaturList = new ArrayList<>();
    private final List<TemperaturListener> listeners = new ArrayList<>();
    private double max = 0;
    private double min = 0;

    public TemperaturVerlauf() {
        addTemperaturListener(new TemperaturListener() {
            @Override
            public void onMaxValueChanged(TemperaturMaxEvent event) {
                LOGGER.info("Max: " + event.getMax());
            }

            @Override
            public void onMinValueChanged(TemperaturMinEvent event) {
                LOGGER.info("Min: " + event.getMin());
            }
        });
    }

    public void add(Temperatur temperatur) {
        if (temperaturList.stream().noneMatch(t -> t.getWert() == temperatur.getWert())) {
            temperaturList.add(temperatur);
            if(temperaturList.size() == 1) {
                this.min = temperatur.getWert();
                this.max = temperatur.getWert();
            }
        }


        final double max = getMax();
        final double min = getMin();
        if (temperaturList.size() == 1 || max > this.max) {
            this.max = max;
            firePropertyChange(new TemperaturMaxEvent(this, this.max));
        }
        if (temperaturList.size() == 1 || min < this.min) {
            this.min = min;
            firePropertyChange(new TemperaturMinEvent(this, this.min));
        }
    }

    public void clear() {
        temperaturList.clear();
    }

    public int getCount() {
        return temperaturList.size();
    }

    public double getMax() {
        final var tem = Collections.max(temperaturList, Temperatur::compareTo);

        return tem != null ? tem.getWert() : 0;
    }

    public double getMin() {
        final var tem = Collections.min(temperaturList, Temperatur::compareTo);
        return tem != null ? tem.getWert() : 0;
    }

    public double getAvg() {
        double sum = 0;
        for (Temperatur temperatur : temperaturList) {
            if (temperatur != null) {
                sum = sum + temperatur.getWert();
            }
        }
        return sum / temperaturList.size();
    }

    public void addTemperaturListener(TemperaturListener listener) {
        listeners.add(listener);
    }

    public void removeTemperaturListener(TemperaturListener listener) {
        listeners.remove(listener);
    }

    private void firePropertyChange(EventObject event) {
        for (TemperaturListener listener : listeners) {
            if (event instanceof TemperaturMaxEvent) {
                listener.onMaxValueChanged((TemperaturMaxEvent) event);
            }
            if (event instanceof TemperaturMinEvent) {
                listener.onMinValueChanged((TemperaturMinEvent) event);
            }
        }
    }

    public List<Double> getWertList() {
        return temperaturList.stream()
                .map(Temperatur::getWert)
                .collect(Collectors.toList());
    }
}
