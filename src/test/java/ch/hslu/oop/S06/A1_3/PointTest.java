package ch.hslu.oop.S06.A1_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void point() {
        final var point = new Point(new Point(1,2));
        assertThat(point.getX()).isEqualTo(1);
        assertThat(point.getY()).isEqualTo(2);
    }
}