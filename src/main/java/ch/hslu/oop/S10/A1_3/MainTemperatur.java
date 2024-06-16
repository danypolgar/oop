package ch.hslu.oop.S10.A1_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Scanner;

public class MainTemperatur {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainTemperatur.class);

    public static void main(String[] args) {
        String input = "";
        final var verlauf = new TemperaturVerlauf();
        final var scanner = new Scanner(System.in);

        do {
            LOGGER.info("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            if (scanner.hasNext()) {
                input = scanner.next();
            }
            if (!input.equals("exit")) {
                try {
                    final float value = Float.parseFloat(input);
                    verlauf.add(Temperatur.createFromCelsius(value));
                    LOGGER.info(input);
                } catch (NumberFormatException e) {
                    LOGGER.error("Bitte ein Zahl eingeben.", e);
                }
            }
        } while (!"exit".equals(input));
        LOGGER.info("Programm beendet.");
        LOGGER.info("Count: %d".formatted(verlauf.getCount()));
        LOGGER.info("AVG: %s".formatted(verlauf.getAvg()));
        LOGGER.info("Min: %s Max: %s".formatted(verlauf.getMin(), verlauf.getMax()));
        try {
            final var dos = new DataOutputStream(new FileOutputStream("/Users/daniel/demo.txt"));
            dos.writeInt(verlauf.getCount());
            verlauf.getWertList().forEach(w -> writeDoubleList(dos, w));
            dos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            final var dis = new DataInputStream(new FileInputStream("/Users/daniel/demo.txt"));
            int count = dis.readInt();
            LOGGER.info(String.valueOf(count));
            for (int i = 0; i < count; i++) {
            LOGGER.info(String.valueOf(dis.readDouble()));
            }
            dis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeDoubleList(DataOutputStream dos, Double w) {
        try {
            dos.writeDouble(w);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
