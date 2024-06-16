package ch.hslu.oop.S05.A1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSwitchableTest {

    @Test
    void sollCount1WennEinschalten() {
        final CountingSwitchable testee = new CountingSwitchable();

        testee.switchOn();

        assertEquals(1, testee.getCount());
    }

    @Test
    void sollCount1WennAusschalten() {
        final CountingSwitchable testee = new CountingSwitchable();

        testee.switchOff();

        assertEquals(1, testee.getCount());
    }
    @Test
    void sollCount2WennAndUndAbschalten() {
        final CountingSwitchable testee = new CountingSwitchable();

        testee.switchOn();
        testee.switchOff();

        assertEquals(2, testee.getCount());
    }

}