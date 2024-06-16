package ch.hslu.oop.S05.A1_3;

import ch.hslu.oop.S05.A1_3.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void test_getPerimeter() {
        final Rectangle testee = new Rectangle(0, 0, 10, 20);

        assertEquals(60, testee.getPerimeter());
    }

}