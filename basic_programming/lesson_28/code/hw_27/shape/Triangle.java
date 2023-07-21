package hw_27.shape;

public class Triangle extends Shape {
    public Triangle(double length) {
        super(length);
    }

    @Override
    public double calcArea() {
        return length * length * Math.sqrt(3)/4; // площадь треугольника
    }

    @Override
    public double calcPerimetr() {
        return 3 * length; // периметр
    }
}
