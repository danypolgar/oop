package ch.hslu.oop.S05.A1_3;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public void changeDimension(int newWidth, int newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
