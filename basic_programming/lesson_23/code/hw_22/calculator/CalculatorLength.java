package hw_22.calculator;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalculatorLength {
    public static void main(String[] args) {
//        (switch case, бесконечный цикл, методы)
//        Составьте программу для перевода мер длины:
//          саженей в метры (1 сажень равна 2,1366 м)
//       дюймов в сантиметры (1 дюйм равен 2,5 см)
//           футов в метры (1 фут равен 0,3048 м)
//          аршинов в метры (1 аршин равен 0,7112 м)
//           дюймов в миллиметры (1 дюйм равен 25,3995 мм)

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Input your choice: 1-сажени в метры, 2 - дюймы в сантиметры, 3 - футы в метры");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    fathomsToMeters();
                    break;
                }
                case 2: {
                    inchesToSm();
                    break;
                }
                case 3: {
                    feetToMeters();
                    break;
                }
                default: {
                    System.out.println("Wrong input.");
                }
            }
            System.out.println("Continue? y/n");
            String ch = scanner.next();
            if (!ch.toLowerCase().equals("y")) {
                break;
            }
        }


    }
    //_____Methods_____________
    public static void fathomsToMeters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input q-ty of fathoms: ");
        double q = scanner.nextDouble();
        System.out.println(q * 2.1366 + " meters");
    }

    public static void inchesToSm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input q-ty of inches: ");
        double q = scanner.nextDouble();
        System.out.println(q * 2.5 + " sm");
    }

    public static void feetToMeters(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input q-ty of fathoms: ");
        double q = scanner.nextDouble();
        System.out.println(q * 0.3048 + " meters");
    }


    //_____end of Methods______
}
