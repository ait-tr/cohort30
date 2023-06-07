import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
//        Пользователь вводит натуральное число (целое, положительное).
//        Выясните, сколько цифр в числе.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number");
        int n = scanner.nextInt();

        // Алгоритм:
        // нужно число делить нацело на 10 до тех пор пока частное больше 0 (целочисленное деление)
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0 целых
        // на каждом шагу увеличиваем счетчик на 1

        int count = 0; // чальное значение
        int div = n;

        while ( div > 0 ) { // пока частное больше 0
            div = div / 10; // делим на 10, вычисляем частное
            count++;
            System.out.println(count);
        }
        System.out.println("Number of digits is: " + count);
    }
}
