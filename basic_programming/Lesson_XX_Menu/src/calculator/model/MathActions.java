package calculator.model;
import java.util.Scanner;

public class MathActions {

    Scanner scanner = new Scanner(System.in);

    public static int sum(int a, int b) {
        return a + b;
    }

    public int deduct(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double sum(double a, double b) {
        return a / b;
    }

}
