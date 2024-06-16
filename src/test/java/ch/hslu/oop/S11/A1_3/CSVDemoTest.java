package ch.hslu.oop.S11.A1_3;

import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.assertj.core.api.Assertions.assertThat;

class CSVDemoTest {

    @Test
    void testFileExists() {
        final var exists = Files.exists(Path.of("/Users/daniel/netatmo-export-202301-202304.csv"));
        assertThat(exists).isTrue();
    }
}