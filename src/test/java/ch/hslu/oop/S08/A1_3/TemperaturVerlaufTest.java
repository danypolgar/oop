package ch.hslu.oop.S08.A1_3;

import org.junit.jupiter.api.Test;

import static ch.hslu.oop.S09.A1_03.MessEinheit.CELSIUS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TemperaturVerlaufTest {
    @Test
    void add() {
        final var verlauf = new TemperaturVerlauf();
        verlauf.add(Temperatur.createFromCelsius(2));
        assertThat(verlauf.getCount()).isEqualTo(1);
    }

    @Test
    void minMax() {
        final var verlauf = new TemperaturVerlauf();
        verlauf.add(Temperatur.createFromCelsius(2));
        verlauf.add(Temperatur.createFromCelsius(1));
        verlauf.add(Temperatur.createFromCelsius(3));
        verlauf.add(Temperatur.createFromCelsius(3));
        assertThat(verlauf.getMax()).isEqualTo(3);
        assertThat(verlauf.getMin()).isEqualTo(1);
        assertThat(verlauf.getAvg()).isEqualTo(2);
    }

    @Test
    void nullList() {
        final var verlauf = new TemperaturVerlauf();
        verlauf.add(null);
        assertThat(verlauf.getMax()).isEqualTo(0);
        assertThat(verlauf.getMin()).isEqualTo(0);
        assertThat(verlauf.getAvg()).isEqualTo(0);
    }

}