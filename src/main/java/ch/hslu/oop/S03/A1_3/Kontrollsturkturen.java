package ch.hslu.oop.S03.A1_3;

public class Kontrollsturkturen {

    public int max(int a, int b) {
        return a > b ? a : b;
    }

    public int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    public int min(int a, int b) {
        return a < b ? a : b;
    }

    public int min(int a, int b, int c) {
        return min(min(a, b), c);
    }




}
