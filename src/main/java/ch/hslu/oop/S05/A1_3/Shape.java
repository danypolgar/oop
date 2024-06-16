package ch.hslu.oop.S05.A1_3;

public abstract class Shape {

    private int x;
    private int y;

    public Shape(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public void move(final int newX, final int newY) {
        x = newX;
        y = newY;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
