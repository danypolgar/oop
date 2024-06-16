package ch.hslu.oop.S10.A1_3;

import ch.hslu.oop.S03.A1_3.Element;
import ch.hslu.oop.S09.A1_03.MessEinheit;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static ch.hslu.oop.S09.A1_03.MessEinheit.*;
import static ch.hslu.oop.S10.A1_3.Aggregatszustand.*;

public class Temperatur implements Comparable<Temperatur> {
    private static final double KELVIN_CONVERTER = 273.15;

    private final double wert;
    private final MessEinheit messEinheit;

    private Temperatur(double wert, MessEinheit messEinheit) {
        validiereWert(wert, messEinheit);
        this.wert = wert;
        this.messEinheit = messEinheit;
    }

    private void validiereWert(double wert, MessEinheit messEinheit) {
        if (messEinheit.equals(CELSIUS) && wert < -KELVIN_CONVERTER) {
            throw new IllegalArgumentException("Zu niedrige Temperatur");
        }
        if (messEinheit.equals(KELVIN) && wert < 0) {
            throw new IllegalArgumentException("Zu niedrige Temperatur");
        }
    }

    public double getWert() {
        return wert;
    }

    public static double calculateKelvin(double celsius) {
        return celsius + KELVIN_CONVERTER;
    }

    public static double calculateFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public Aggregatszustand aggregatsZustand(String elementenbezeichnung) {

        final var element = Element.fromValue(elementenbezeichnung);
        if (element.isGasfoermig(wert)) {
            return GAS;
        } else if (element.isFest(wert)) {
            return SOLID;
        } else {
            return LIQUID;
        }
    }

    public static Temperatur createFromCelsius(final float celsius) {
        return new Temperatur(celsius, CELSIUS);
    }

    public static Temperatur createFromKelvin(final float kelvin) {
        return new Temperatur(kelvin, KELVIN);
    }

    public static Temperatur createFromFahrenheit(final float fahrenheit) {
        return new Temperatur(fahrenheit, FAHRENHEIT);
    }

    @Override
    public String toString() {
        return "Temperatur{" +
                "celsius=" + wert +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperatur that = (Temperatur) o;
        return Double.compare(that.wert, wert) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wert);
    }

    @Override
    public int compareTo(Temperatur temperatur) {
        if(temperatur == null) {
        return -1;
        }
        return Double.compare(wert, temperatur.wert);
    }
}
