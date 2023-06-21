package practice.rectangle.controller;

import practice.rectangle.model.Rectangle;

public class RectangleAppl {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(10.0,25.0); // создаем объект типа Rectangle
        System.out.println(rectangle1.perimeter(10, 25));
        double s = rectangle1.square(10, 25);
        System.out.println("Square is : " + s);

        rectangle1.setA(50);
        rectangle1.setB(100);

        System.out.println(rectangle1.a);
        System.out.println(rectangle1.b);

    }
}
