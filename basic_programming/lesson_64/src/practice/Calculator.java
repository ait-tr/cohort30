package practice;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }


    public static void main(String[] args) {
        long assertation = 1l + Integer.MAX_VALUE;
        System.out.println(new Calculator().add(Integer.MAX_VALUE, 1) == assertation);
        System.out.println(assertation);

        System.out.println(new Calculator().add(-5, 5) == 0);

    }
}

