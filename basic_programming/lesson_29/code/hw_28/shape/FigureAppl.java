package hw_28.shape;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] figure = new Shape[4]; // каждый новый класс в Java - это новый тип данных

        figure[0] = new Circle(10.0); // используем конструктор
        figure[1] = new Circle(3.0); // используем конструктор
        figure[2] = new Triangle(5.0); // используем конструктор
        figure[3] = new Square(10.0); // используем конструктор

//        решение "в лоб, перебор руками"
//        double s = figure[0].calcArea(figure[0].getLength()) + figure[1].calcArea(figure[1].getLength()) + figure[2].calcArea(5) + figure[3].calcArea(10);
//        System.out.println("S = " + s);
//        double p = figure[0].calcPerimetr(10) + figure[1].calcPerimetr(3) + figure[2].calcPerimetr(5) + figure[3].calcPerimetr(10);
//        System.out.println("P = " + p);

        // решение циклом for
        double s1 = 0;
        double p1 = 0;
        for (int i = 0; i < figure.length; i++) {
            s1 = s1 + figure[i].calcArea();
            p1 = p1 + figure[i].calcPerimetr();
        }

        System.out.println("S calculated by loop = " + s1);
        System.out.println("P calculated by loop = " + p1);

//         решение циклом for each
        double s3 = 0;
        double p3 = 0;
        for (Shape figura : figure ) {
            s3 += figura.calcArea();
            p3 += figura.calcPerimetr();
        }
        System.out.println("S calculated by loop for each = " + s3);
        System.out.println("P calculated by loop for each = " + p3);

//        Рассчитайте общую площадь кругов из задачи 2.
        double s2circle = 0;
        for (int i = 0; i < figure.length; i++) {
            if ( figure[i] instanceof Circle) {
                s2circle = s2circle + figure[i].calcArea();
            }
        }
        System.out.println("Sum of 2 circles area is ( other way of calculation ) = " + s2circle);
    }
}
