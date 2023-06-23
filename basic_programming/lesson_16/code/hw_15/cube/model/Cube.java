package hw_15.cube.model;

public class Cube {
    // поле класса
    double side;

    // конструктор класса
    public Cube(double side) {
        this.side = side;
    }

    // методы класса
    public double perimetr(double a){
        return 12*a;
    }
    public double square(double a) {
        return 6 * a * a;
    }
    public double volume(double a) {
        return a * a * a;
    }

}
