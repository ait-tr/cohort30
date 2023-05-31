import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            System.out.println("Pythagorean theorem"); // печатаем в консоли анонс программы

            Scanner scanner = new Scanner(System.in); // включаем Scanner, это нужно для ввода данных
            // от пользователя с клавиатуры

            System.out.println("Input 1st leg: "); // печатаем приглашение пользователю
            double a = scanner.nextDouble(); // считываем данные с клавиатуры

            System.out.println("Input 2nd leg: ");// печатаем приглашение пользователю
            double b = scanner.nextDouble(); // считываем данные с клавиатуры

            double с = Math.sqrt(a*a + b*b); //  вычисляем длину гипотенузы

            // double z = Math.pow(a, 2); // возведение во 2-ю степень

            System.out.println("Hypotenuse = " + с); // печатаем текст и значение переменной с
            System.out.printf("Hypotenuse = %.4f", с); // форматированный вывод
        }
    }