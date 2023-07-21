package hw_27.shape;
//        1. Создайте абстрактный класс Shape с типом поля double и абстрактными методами calcArea и calcPerimeter.
//        2. Создать классы hw_27.Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//        3. Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга,
//        один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public abstract class Shape {
    double length;

    public Shape(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public abstract double calcArea(double length);
    public abstract double calcPerimetr(double length);

}
