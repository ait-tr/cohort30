package hw_26.shape;

public class Square extends Shape {

    public Square(double a) {
    }

    @Override
    public double calcArea(double a) {
        return a * a;
    }

    @Override
    public double calcPerimetr(double a) {
        return 4 * a;
    }
}
