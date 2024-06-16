package ch.hslu.oop.S05.A1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StickstoffTest {

    @Test
    void soll_fest_wenn_minus_210() {
        Stickstoff stickstoff = new Stickstoff();

        assertEquals("fest", stickstoff.getAggregatsZustand(-210));
    }

    @Test
    void soll_fluessig_wenn_minus_200() {
        Stickstoff stickstoff = new Stickstoff();

        assertEquals("flüssig", stickstoff.getAggregatsZustand(-200));
    }

    @Test
    void soll_gasfoermig_wenn_minus_195() {
        Stickstoff stickstoff = new Stickstoff();

        assertEquals("gasförmig", stickstoff.getAggregatsZustand(-195));
    }

}