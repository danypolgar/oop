package ch.hslu.oop.S06.A1_3;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
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

    public void moveRelative(Point point){
        this.x += point.x;
        this.y += point.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }


}
