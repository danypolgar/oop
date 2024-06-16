package ch.hslu.oop.S03.A1_3;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getQuadrant() {
        if (x > 0 && y > 0) {
            return 1;
        }

        if (x < 0 && y > 0) {
            return 2;
        }

        if (x < 0 && y < 0) {
            return 3;
        }

        if (x > 0 && y < 0) {
            return 4;
        }

        return 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
