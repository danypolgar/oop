package ch.hslu.oop.S05.A1_3;

public class Square extends Shape {

    private final int length;

    public Square(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
