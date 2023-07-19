package hw_26.shape;

public class Circle extends Shape{

    public Circle(double a) {
    }

    @Override
    public double calcArea(double a) {
        return Math.PI * a * a;
    }

    @Override
    public double calcPerimetr(double a) {
        return 2 * Math.PI * a;
    }
}
