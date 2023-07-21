package hw_27.shape;

public class Circle extends Shape {
    public Circle(double length) {
        super(length);
    }

    @Override
    public double calcArea() {
        return Math.PI * length *length; // вычисляем площадь круга
    }

    @Override
    public double calcPerimetr() {
        return 2 * Math.PI * length; // вычисляем длину окружности
    } //
}
