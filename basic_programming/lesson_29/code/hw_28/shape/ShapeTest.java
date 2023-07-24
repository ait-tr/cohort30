package hw_28.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    Shape shape;
    Circle circle;
    Square square;
    Triangle triangle;

    @BeforeEach
    void setUp() {
        Shape sh1 = new Circle(10);
        Shape sh2 = new Square(2);
        Shape sh3 = new Triangle(10);
    }

    @Test
    void calcAreaCircleTest() {
        Shape sh1 = new Circle(10);
        assertEquals(314.1592653589793, sh1.calcArea());
    }

    @Test
    void calcAreaSquareTest() {
        Shape sh2 = new Square(2);
        assertEquals(4.0, sh2.calcArea());
    }

    @Test
    void calcAreaTriangleTest() {
        Shape sh3 = new Triangle(5.0);
        assertEquals(10.825317547305483, sh3.calcArea());
    }

    @Test
    void calcPerimetr() {
    }
}