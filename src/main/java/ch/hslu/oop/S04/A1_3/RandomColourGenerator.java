package ch.hslu.oop.S04.A1_3;

import java.util.Random;

public class RandomColourGenerator {

    /**
     * Generates a random colour.
     *
     * @return a random colour
     */
    public Colour generate() {
        final int randomNumber = new Random().nextInt(0, Colour.values().length);

        return Colour.values()[randomNumber];
    }

}
