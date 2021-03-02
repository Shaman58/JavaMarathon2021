package day9.Task2;

public class Rectangle extends Figure {
    private int width, length;

    public Rectangle(int width, int length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color) {
        super(color);
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }
}
