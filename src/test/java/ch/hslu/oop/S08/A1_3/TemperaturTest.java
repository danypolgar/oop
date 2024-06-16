package ch.hslu.oop.S08.A1_3;

import org.junit.jupiter.api.Test;

import static ch.hslu.oop.S09.A1_03.MessEinheit.CELSIUS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TemperaturTest {
    @Test
    void kelvin() {
        double kelvin = Temperatur.calculateKelvin(3);
        assertThat(kelvin).isEqualTo(276.15);
    }

    @Test
    void fahrenheit() {
        double fh = Temperatur.calculateFahrenheit(3);
        assertThat(fh).isEqualTo(37.4);
    }

    @Test
    void aggregatszustandGas() {
        final var testee = Temperatur.createFromCelsius(2);

        final var zustand = testee.aggregatsZustand("N");

        assertThat(zustand).isEqualTo(Aggregatszustand.GAS);
    }

    @Test
    void aggregatszustandLiquid() {
        final var testee = Temperatur.createFromCelsius(2);

        final var zustand = testee.aggregatsZustand("Hg");

        assertThat(zustand).isEqualTo(Aggregatszustand.LIQUID);
    }

    @Test
    void aggregatszustandSolid() {
        final var testee = Temperatur.createFromCelsius(2);

        final var zustand = testee.aggregatsZustand("Pb");

        assertThat(zustand).isEqualTo(Aggregatszustand.SOLID);
    }

    @Test
    void celsuisException() {
        assertThrows(IllegalArgumentException.class, () -> Temperatur.createFromCelsius(-300),"Zu niedrige Temperatur");
    }

    @Test
    void kelvinException() {
        assertThrows(IllegalArgumentException.class, () -> Temperatur.createFromKelvin(-300), "Zu niedrige Temperatur");
    }
}