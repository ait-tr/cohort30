package practice;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
//        Написать метод, определяющий, является ли число простым (primary). Проcтое число - это число,
//        которое делится только на себя и 1. Примеры: 2, 7, 11, 19, 47.
//        Что не входе? - целое, положительное число int n.
        // Что на выходе? - boolean, ответ на поставленный вопрос
        // ключевой алгоритм: - перебрать все числа от 2 до (n -1) и проверить, разделилось ли число на любое из них
        // - если не произошло, тогда это число n - простое, иначе - оно НЕпростое.

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input integer positive number: ");
            int n = scanner.nextInt();
            boolean isPrime = true;
            System.out.println("n =  " + n);

            for (int i = 2; i < n - 1; i++) {
                if (n % i == 0) { // если хотя бы раз разделилось, то
                    isPrime = false;// объявим, что число НЕпростое и можно выйти из цикла
                }
            }

            if (isPrime) {
                System.out.println("Number " + n + " is prime.");
            } else {
                System.out.println("Number " + n + " is NOT prime.");
            }
        }
    }
}
