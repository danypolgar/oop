package ch.hslu.oop.S03.A1_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchweizerkreuzTest {

    @Test
    void test_printSwissCross() {
        final var testee = new Schweizerkreuz();

        testee.printSwissCross(6);
    }

}