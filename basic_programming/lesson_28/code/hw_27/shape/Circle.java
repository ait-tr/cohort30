package hw_27.shape;

public class Circle extends Shape {
    public Circle(double length) {
        super(length);
    }

    @Override
    public double calcArea(double length) {
        return Math.PI * length *length;
    }

    @Override
    public double calcPerimetr(double length) {
        return 2 * Math.PI * length * length;
    }
}
