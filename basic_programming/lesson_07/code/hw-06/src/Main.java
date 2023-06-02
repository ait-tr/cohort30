import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*     Напишите программу, которая читает строку от пользователя, определяет левый индекс и правый
        индекс (концы строки) и выводит получившуюся в результате substring с левым и правым индексом.*/

        System.out.println("Работа со строкой");
        System.out.println("-----------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input string : ");
        String perLine = sc.nextLine(); // читаем строку
        System.out.println("---------------------------");

        int l = perLine.length(); // определили длину строки
        int leftIndex = 0;
        int rightIndex = l - 1;

        char a = perLine.charAt(leftIndex);
        System.out.println(a); // что стоит в начале строки

        char b = perLine.charAt(rightIndex);
        System.out.println(b);
        System.out.println("---------------------------");

        System.out.println( perLine.substring(leftIndex, rightIndex + 1));

        System.out.println("---------------------------");
    }
}