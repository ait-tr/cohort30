import java.util.Scanner;

public class absNumber {
    public static void main(String[] args) {
//        Пользователь вводит с клавитуры число.
//        Вывести абсолютное значение (модуль) числа, используя тернарный оператор.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number: "); // - приглашение пользователю
        int num = scanner.nextInt(); // считали чис

        int abs_num = (num > 0) ? num : -num; // это тернарный операто

        System.out.println("Absolute value of number is :" + abs_num);

        // System.out.println("Absolute value of number is :" + ((num > 0) ? num : -num)); это второй вариант
        // (num > 0) ? num : -num - это тернарный операто

    }
}
