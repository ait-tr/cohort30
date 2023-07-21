package hw_27.shape;

public class Square extends Shape {

    public Square(double length) {
        super(length);
    }

    @Override
    public double calcArea(double length) {
        return length * length;
    }

    @Override
    public double calcPerimetr(double length) {
        return 4 * length;
    }

}
