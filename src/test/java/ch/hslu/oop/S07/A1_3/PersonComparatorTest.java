package ch.hslu.oop.S07.A1_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonComparatorTest {

    @Test
    void compare() {
        final var personComperator = new PersonComparator();
        Person o1 = new Person(1, "e", "r");
        Person o2 = new Person(1, "e", "r");
        assertThat(personComperator.compare(o1, o2)).isEqualTo(0);
    }
}