public class Calculator {
    public static void main(String[] args) {
        package Test;

import java.util.Scanner;

        public class Test_Method {
            public static void main(String[] args) {

            // какой будет интерфейс? -
                //


                Scanner scan = new Scanner(System.in);
                System.out.print("Input first number: ");
                double a = scan.nextDouble();
                System.out.print("Input second number: ");
                double b = scan.nextDouble();

                double c = multiply(a,b);

                System.out.print("Result: " + c);
            }

            public static double multiply (double x , double y) {
                double result = x * y;
                return result;
    }

            public static double division (double a , double b) {
                double result = a / b;
                return result;
            }

            public static double sum (double a , double b) {
                double result = a + b;
                return result;
            }
}