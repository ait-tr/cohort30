import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
//        Составьте программу, которая вычисляет сумму чисел от 1 до N.
//        Значение N вводится с клавиатуры.
        System.out.println("Sum of numbers less than N");
        //что на входе - число N, пусть N = 9, int num (или n, number)
        // что на выходе - 1 + 2 + 3 + ... + 8 + 9
        // ключевой алгоритм - запустить цикл while
        // количество повторов - (N-1), пока что-то меньше N, а начинаем с 1
        // будем накапливать сумму на каждом шагу цикла в этой переменной int sum
        // параметр цикла int i , i = 1, на каждом шагу цикла i = i + 1

        // 9 < 9 - имеет значение false

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int n = scanner.nextInt(); // считываем целое число

        int i = 0; // задаем переменную и даем ей начальное значение
        int sum = 0; // задаем переменную и даем ей начальное значение

        while ( i < n ) {
            // то, что повторяется
            sum = sum + (i + 1); // суммируем 1 , 2, 3 и т.д.
            System.out.println("sum = " + sum);
            i =  i + 1; // увеличиваем параметр цикла
            System.out.println("i = " + i);
        } // end of while
        System.out.println("Sum =  " + sum); // напечатали результат
    }
}
