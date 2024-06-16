package ch.hslu.oop.S05.A1_3;

import ch.hslu.oop.S05.A1_3.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void test_getPerimeter() {
        final var testee = new Square(0, 0, 10);

        assertEquals(40, testee.getPerimeter());
    }
}