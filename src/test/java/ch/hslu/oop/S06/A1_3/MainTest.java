package ch.hslu.oop.S06.A1_3;

import ch.hslu.oop.S05.A1_3.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Shape shape1 = new Circle(0, 0, 5);
    private final Shape shape2 = new Rectangle(0, 0, 10, 10);
//    private final AbstractNamed object = new Stickstoff();

    @Test
    void test_main() {
        shape1.move(5, 5);
        System.out.println(((Circle) shape1).getDiameter());

    }



}