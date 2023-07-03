package hw_19.prime_number;

import java.util.Scanner;

public class ArrayOfDiv {
    public static void main(String[] args) {
//      Вводится пользователем натуральное число n.
//      Сформировать массив из всех делителей данного числа.

        Scanner scanner = new Scanner(System.in); // включили Scanner
        System.out.println("Input integer positive number: "); // приглашение пользователю
        int n = scanner.nextInt(); // считали число
        int[] array = new int[n]; // определили массив
        int j = 0; // индекс для массива с делителями числа n
        // заполняем массив делителями числа n
        System.out.println("n =  " + n);
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) { // если n разделилось на i, то
                array[j] = i; // pf записываем делитель в массив
                j++; // индекс элементов массива увеличиваем на 1
            }
        }

        // print array
        for (int i = 0; i < j; i++) {
            System.out.println(array[i]);
        }
    }
}
