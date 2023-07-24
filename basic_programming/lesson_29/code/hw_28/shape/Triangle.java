package hw_28.shape;

public class Triangle extends Shape {
    public Triangle(double length) {
        super(length);
    }

    @Override
    public double calcArea() {
        return length * length * Math.sqrt(3.0)/4.0; // площадь треугольника // * length * length / 4.0
    }

    @Override
    public double calcPerimetr() {
        return 3 * length; // периметр
    }
}
