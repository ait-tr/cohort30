import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            System.out.println("Pythagorean theorem");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input 1st leg: ");
            double a = scanner.nextDouble();
            System.out.println("Input 2nd leg: ");
            double b = scanner.nextDouble();
            double с = Math.sqrt(a*a + b*b);
            System.out.println("Hypotenuse = " + с);
            System.out.printf("Hypotenuse = %.2f", с); // форматированный вывод
        }
    }