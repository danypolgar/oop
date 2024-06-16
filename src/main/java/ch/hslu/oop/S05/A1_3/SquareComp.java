package ch.hslu.oop.S05.A1_3;

public class SquareComp extends Shape {

    private final Rectangle rectangle;

    public SquareComp(int x, int y, int length) {
        super(x, y);
        rectangle = new Rectangle(x, y, length, length);
    }

    public double getPerimeter() {
        return rectangle.getPerimeter();
    }

    public double getArea() {
        return rectangle.getArea();
    }

}
