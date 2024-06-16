package ch.hslu.oop.S03.A1_3;

public class Schleifen {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);


        i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    void iterativeAddition() {
        final var summand = 0.000025f;
        var value = 0.9f;

        while (value < 1.0f) {
            value += summand;
        }

        System.out.println(value);

    }

    public void iteration() {
        final var summand = 0.000025f;
        float value = 0.9f;

        for (int i = 0; i < 4000; i++) {
            value += summand;
        }

        System.out.println(value);
    }

    public void printBox(int width, int height) {
        for (int i = 0; i < width; i++) {
            System.out.print("#");
        }
        System.out.println("");
        for(int i = 0; i < height - 2; i++) {
            System.out.print("#");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("#");
        }
    }
}
