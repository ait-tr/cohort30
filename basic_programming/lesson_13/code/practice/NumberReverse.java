package practice;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
//        Пользователь вводит натуральное число.
//        Распечатайте это число в обратном порядке.

        Scanner sc = new Scanner(System.in);
        System.out.println("Input integer positive number: ");
        int n = sc.nextInt();
        int digits = 0;
        int nd = n;

        // занесем цифры числа в массив, а потом распечатаем его. Если надо будет, то мы его распечаем в обратном порядке.
        // этот цикл считает количество цифр в числе, вычисляем длину нужного нам массива
        while (n > 0) {
            digits++;
            n = n / 10;
        }

        System.out.println(digits);

        int[] digit = new int[digits]; // задаем массив длинной сколько у нас есть цифр в числе n

        // в массив digit заносим цифры числа
        for (int i = 0; i < digit.length; i++) {
            digit[i] = nd % 10; // остаток от деления на 10 - это и есть, например 567 : 10 => 7 в остатке
            nd = nd / 10; // уменьшение числа в 10 раз
        }

        printArray(digit);
        System.out.println();
        printArrayRevers(digit);

    }
    //____Methods____
    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }

    public static void printArrayRevers (int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " | ");
        }
    }
    //___end of Methods ______
}
