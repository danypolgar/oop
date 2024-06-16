package ch.hslu.oop.S07.A1_3;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void person() {
        final var person = new Person(1,"w", "e");
        final var person2 = new Person(1,"w", "e");
        assertThat(person).isEqualTo(person2);
        assertThat(person.hashCode()).isEqualTo(person2.hashCode());
    }

    @Test
    void personcomp() {
        final var person = new Person(1,"w", "e");
        final var person2 = new Person(1,"w", "e");
        assertThat(person.compareTo(person2)).isEqualTo(0);
    }

    @Test
    void personcomp2() {
        final var person = new Person(1,"w", "e");
        final var person2 = new Person(2,"w", "e");
        assertThat(person.compareTo(person2)).isEqualTo(-1);
    }

    @Test
    void personcomp3() {
        final var person = new Person(1,"w", "e");
        final var person2 = new Person(-1,"w", "e");
        assertThat(person.compareTo(person2)).isEqualTo(1);
    }
}