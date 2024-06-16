package ch.hslu.oop.S05.A1_3;

public final class Circle extends Shape {

    private int diameter;

    public Circle(final int x, final int y, final int diameter) {
        super(x, y);
        this.diameter = diameter;
    }

    @Override
    public double getPerimeter() {
        return diameter * Math.PI;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow((double) diameter / 2, 2);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(final int diameter) {
        this.diameter = diameter;
    }
}
