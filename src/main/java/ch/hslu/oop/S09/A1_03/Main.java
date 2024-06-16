package ch.hslu.oop.S09.A1_03;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        String input;
        final var scanner = new Scanner(System.in);
        do {
            LOGGER.info("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();
            try {
                Float.parseFloat(input);
                LOGGER.info(input);
            } catch (NumberFormatException e) {
                LOGGER.error("Bitte ein Zahl eingeben.", e);
            }
        } while (!"exit".equals(input));
        LOGGER.info("Programm beendet.");
    }
}
