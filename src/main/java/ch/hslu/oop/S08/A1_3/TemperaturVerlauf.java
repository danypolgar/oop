package ch.hslu.oop.S08.A1_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemperaturVerlauf {
    List<Temperatur> temperaturList = new ArrayList<>();

    public void add(Temperatur temperatur) {
        if (temperaturList.stream().noneMatch(t -> t.getWert() == temperatur.getWert())) {
            temperaturList.add(temperatur);
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
        return tem != null ? tem.getWert(): 0;
    }

    public double getMin() {
        final var tem = Collections.min(temperaturList, Temperatur::compareTo);
        return tem != null ? tem.getWert(): 0;
    }

    public double getAvg() {
        double sum = 0;
        for (Temperatur temperatur : temperaturList) {
            if(temperatur != null) {
            sum = sum + temperatur.getWert();
            }
        }
        return sum / temperaturList.size();
    }
}
