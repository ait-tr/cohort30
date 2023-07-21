package hw_27.shape;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] figure = new Shape[4];

        figure[0] = new Circle(10.0);
        figure[1] = new Circle(3.0);
        figure[2] = new Triangle(5.0);
        figure[3] = new Square(10.0);

        // решение "в лоб, перебор руками"

        double s = figure[0].calcArea(figure[0].getLength()) + figure[1].calcArea(figure[1].getLength()) + figure[2].calcArea(5) + figure[3].calcArea(10);
        System.out.println("S = " + s);

        double p = figure[0].calcPerimetr(10) + figure[1].calcPerimetr(3) + figure[2].calcPerimetr(5) + figure[3].calcPerimetr(10);
        System.out.println("P = " + p);

        // решение циклом for
        double s1 = 0;
        double p1 = 0;
        for (int i = 0; i < figure.length; i++) {
            s1 = s1 + figure[i].calcArea(figure[i].getLength());
            p1 = p1 + figure[i].calcPerimetr(figure[i].getLength());
        }

        System.out.println("S calculated by loop = " + s1);
        System.out.println("P calculated by loop = " + p1);

//        Рассчитайте общую площадь кругов из задачи 2.
        Circle c1 = new Circle(10.0);
        Circle c2 = new Circle(3.0);
        double ss = c1.calcArea(c1.getLength()) + c2.calcArea(c2.getLength());
        System.out.println("Sum of 2 circles area is = " + ss);

        // Другой способ
        double s2 = 0;
        for (int i = 0; i < figure.length; i++) {
            if ( figure[i] instanceof Circle) {
                s2 = s2 + figure[i].calcArea(figure[i].getLength());
            }
        }
        System.out.println("Sum of 2 circles area is ( other way of calculation ) = " + s2);



    }
}
