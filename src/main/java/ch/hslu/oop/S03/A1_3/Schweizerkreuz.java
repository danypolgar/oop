package ch.hslu.oop.S03.A1_3;

public class Schweizerkreuz {

    private static final String FILLED_FIELD = "#";
    private static final String EMPTY_FIELD = " ";

    public void printSwissCross(int size) {
        printThinPart(size);
        printWidePart(size);
        printThinPart(size);
    }

    private void printWidePart(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(FILLED_FIELD.repeat(size).repeat(3));
        }
    }

    private void printThinPart(int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(EMPTY_FIELD.repeat(size) + FILLED_FIELD.repeat(size));
        }
    }
}