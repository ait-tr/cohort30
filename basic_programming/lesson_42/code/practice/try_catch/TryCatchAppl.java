package practice.try_catch;

import java.util.Scanner;

public class TryCatchAppl {
    public static void main(String[] args) {
//        1. Деление на 0;
//        2. Выход за пределы массива;
//        3. Проверка ввода пользователя на корректность.
/*
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input first number: ");
            int a = scanner.nextInt();
            System.out.println("Input second number: ");
            int b = scanner.nextInt();
            int division = a / b;
            System.out.println("Division " + a + " / " + b + " = " + division);
        } catch (Exception e) {
            System.out.println(e.getMessage() + ", " + e.getCause());
        }
*/
/*
        int[] arr = {5, -7, 17, 29, 30};

        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            System.out.println(arr[7]);
        } catch (Exception e) {
            System.out.println(e.getMessage() + ", " + e.toString());
        }
  */

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input first number: ");
            int a = scanner.nextInt();
            System.out.println("Your input is: " + a);

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
