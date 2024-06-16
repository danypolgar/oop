package ch.hslu.oop.S11.A1_3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public class CSVDemo {

    public static void main(String[] args) {
        try {
            final var reader = new BufferedReader(new InputStreamReader(new FileInputStream("/Users/daniel/netatmo-export-202301-202304.csv")));
            final var temperatures = new ArrayList<>();
            final var timeStamps = new ArrayList<>();
            reader.lines().forEach(l -> {
                final var lv = l.split(";");
                final var timestamp = LocalDateTime.parse(lv[1], DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\""));
                final var temperatur = Double.valueOf(lv[2]);
                temperatures.add(temperatur);
                timeStamps.add(timestamp);
                System.out.printf("Temeratur: %s Datum: %s%n", temperatur, timestamp);
            });
            double max = temperatures.stream().mapToDouble(d -> Double.parseDouble(d.toString())).max().getAsDouble();
            System.out.println(max);
            System.out.println(timeStamps.get(temperatures.indexOf(max)));
            double min = temperatures.stream().mapToDouble(d -> Double.parseDouble(d.toString())).min().getAsDouble();
            System.out.println(min);
            System.out.println(timeStamps.get(temperatures.indexOf(min)));
            System.out.println(temperatures.stream().mapToDouble(d -> Double.parseDouble(d.toString())).sum() / temperatures.size());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
