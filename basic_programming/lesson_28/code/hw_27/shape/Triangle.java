package hw_27.shape;

public class Triangle extends Shape {
    public Triangle(double length) {
        super(length);
    }

    @Override
    public double calcArea(double length) {
        return length * length * Math.sqrt(3)/4;
    }

    @Override
    public double calcPerimetr(double length) {
        return 3 * length;
    }
}
