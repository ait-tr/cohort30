package practice;

import java.util.*;
import java.util.stream.*;

public class Classwork {

    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
    }

    // Задача 1: Найти максимальный элемент в списке.
    static void first() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // С использованием цикла:
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);  // Output: 5

        // решить с помощью mapToInt и max
        int maxStream = Integer.MIN_VALUE;

        System.out.println(maxStream);  // Output: 5
    }

    // Задача 2: Собрать все строки в одну, разделенные запятой.
    static void second() {
        List<String> list = Arrays.asList("apple", "banana", "cherry");

        // С использованием цикла:
        StringBuilder result = new StringBuilder();
        for (String str : list) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(str);
        }
        System.out.println(result.toString());  // Output: apple, banana, cherry

        // решить с помощью collect и Collectors.joining(", ")
        String resultStream = null;

        System.out.println(resultStream);  // Output: apple, banana, cherry
    }

    // Задача 3: Проверить, есть ли в списке число больше 10.
    static void third() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // С использованием цикла:
        boolean found = false;
        for (int num : list) {
            if (num > 10) {
                found = true;
                break;
            }
        }
        System.out.println(found);  // Output: false

        // решить с помощью anyMatch
        boolean foundStream = false;

        System.out.println(foundStream);  // Output: false
    }

    // Задача 4: Найти среднее значение всех чисел в списке.
    static void fourth() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // С использованием цикла:
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double average = (double) sum / list.size();
        System.out.println(average);  // Output: 3.0

        // решить с помощью mapToInt, average, orElse
        double averageStream = 0;
        System.out.println(averageStream);  // Output: 3.0
    }

    // Задача 5: Получить список уникальных элементов.
    static void fifth() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 4);

        // С использованием цикла:
        Set<Integer> unique = new HashSet<>();
        for (int num : list) {
            unique.add(num);
        }
        System.out.println(unique);  // Output: [1, 2, 3, 4, 5]

        // решить с помощью collect Collectors.toSet()
        Set<Integer> uniqueStream = null;
        System.out.println(uniqueStream);  // Output: [1, 2, 3, 4, 5]
    }
}

