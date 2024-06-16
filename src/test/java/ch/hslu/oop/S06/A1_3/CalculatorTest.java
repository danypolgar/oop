package ch.hslu.oop.S06.A1_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        final Calculator calc = new Rechner();
        assertThat(calc.addition(1,2)).isEqualTo(3);
    }

}