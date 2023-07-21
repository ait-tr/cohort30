package hw_27.shape;
//        1. Создайте абстрактный класс Shape с типом поля double и абстрактными методами calcArea и calcPerimeter.
//        2. Создать классы hw_27.Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//        3. Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга,
//        один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public abstract class Shape {
    double length; // длина какого-то ребра для фигуры, для окружности - радиус, для квадрата - сторона,
    // для треугольника - сторона

    // конструктор
    public Shape(double length) {
        this.length = length;
    }

    // геттер
    public double getLength() {
        return length;
    }
    // сеттер
    public void setLength(double length) {
        this.length = length;
    }

    public abstract double calcArea(); // тело метода отсутствует!

    public abstract double calcPerimetr(); // тело метода отсутствует!

}
