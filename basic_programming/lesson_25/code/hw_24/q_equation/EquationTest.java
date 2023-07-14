package hw_24.q_equation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EquationTest {
    Equation equation;

    @BeforeEach
    void setUp() {
        equation = new Equation();
    }

    @Test
    void root1Test() {
        Double a = 20.;
        Double b = 4.;
        Double с = 2.;
        assertEquals(-1, equation.root1(a, b, с));

    }

    @Test
    void root2() {
        Double a = 1.0;
        Double b = - 5.0;
        Double с = 6.0;
        assertEquals(2, equation.root2(a, b, с));
    }
}