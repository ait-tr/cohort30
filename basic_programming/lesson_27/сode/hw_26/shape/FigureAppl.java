package hw_26.shape;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] figure = new Shape[4];

        figure[0] = new Circle(10.0);
        figure[1] = new Circle(3.0);
        figure[2] = new Triangle(5.0);
        figure[3] = new Square(10.0);

        // решение "в лоб, перебор руками"

        double s = figure[0].calcArea(10) + figure[1].calcArea(3) + figure[2].calcArea(5) + figure[3].calcArea(10);
        System.out.println("S = " + s);

        double p = figure[0].calcPerimetr(10) + figure[1].calcPerimetr(3) + figure[2].calcPerimetr(5) + figure[3].calcPerimetr(10);
        System.out.println("P = " + p);

//        Рассчитайте общую площадь кругов из задачи 2.
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(3.0);
        double ss = c1.calcArea(10) + c2.calcArea(3.0);
        System.out.println("Sum of 2 circles area is " + ss);

    }
}
