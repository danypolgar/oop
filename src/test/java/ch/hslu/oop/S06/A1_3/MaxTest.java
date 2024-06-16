package ch.hslu.oop.S06.A1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void should_return_5_when_given_1_2_3_4_5() {
        final Max max = new Max();

        final double actual = max.max(1, 2, 3, 4, 5);

        assertEquals(5, actual);
    }

}