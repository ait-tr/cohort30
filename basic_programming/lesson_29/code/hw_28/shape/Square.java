package hw_28.shape;

public class Square extends Shape {

    public Square(double length) {
        super(length);
    }

    @Override
    public double calcArea() {
        return length * length; // площадь квадрата
    }

    @Override
    public double calcPerimetr() {
        return 4 * length;
    } // периметр

}
