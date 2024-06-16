package ch.hslu.oop.S06.A1_3;

import java.util.Arrays;

public class Max {

    public double max(double... values) {
        return Arrays.stream(values).summaryStatistics().getMax();
    }

}
