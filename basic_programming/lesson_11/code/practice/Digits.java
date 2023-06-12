package practice;

import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
    // тело основного метода main
        System.out.println("Methods practice ");

        // определить количество цифр у натурального числа (делим в цикле число на 10 пока остаток от деления больше 0)
    Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer positive number:");
        int num = scanner.nextInt();
        int digits = numberOfDigits(num); // вызов метода и передача ему на вход параметра
        System.out.println("Number of digits is: " + digits);

        // сумма цифр
        int sumDigits = sumOfDigits(num);
        System.out.println("Sum of digits: " + sumDigits);

    }
    //_____________Methods_________________

    public static int numberOfDigits (int n) {
        int count = 1; // инициировал счетчик цифр
        while (n / 10 > 0) {
            count++; // считаю количество цифр
            n = n/10; // целочисленное деление
        }
        return count;
    }

    public static int sumOfDigits (int n) {
        int sum = 0;
        while (n *10 / 10 > 0){
            sum = sum + n % 10; // это цифра числа, их суммируем
            n = n/10; // уменьшаем число в 10 раз
        }
        return sum;
    }


    //__________End of Methods ____________
}
