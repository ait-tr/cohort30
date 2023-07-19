package hw_26.shape;

public class Triangle extends Shape{
    public Triangle(double a) {
        super();
    }

    @Override
    public double calcArea(double a) {
        return a * a * Math.sqrt(3) / 4.0;
    }

    @Override
    public double calcPerimetr(double a) {
        return a * 3;
    }
}
