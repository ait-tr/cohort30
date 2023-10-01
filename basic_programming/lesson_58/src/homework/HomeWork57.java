package homework;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class HomeWork57 {
    public static void main(String[] args) throws IOException {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // Задание 1: Работа с потоками данных
    public static void task1() {
        List<Integer> numbers = IntStream.rangeClosed(1, 100)  // создаем поток чисел от 1 до 100
                .boxed()              // упаковываем int в Integer
                .collect(Collectors.toList());  // собираем в список

        List<Integer> result = numbers.stream()  // создаем поток из списка
                .filter(n -> n % 2 == 0)  // отфильтровываем только четные числа
                .map(n -> n * 2)          // умножаем каждое число на 2
                .collect(Collectors.toList());  // собираем результат в новый список

        System.out.println(result);  // выводим результат в консоль
    }

    // Задание 2: Работа с файлами
    public static void task2() throws IOException {
        Path path = Paths.get("example.txt");  // путь к файлу

        // Чтение файла
        Files.lines(path).forEach(System.out::println);  // читаем и выводим строки файла в консоль

        // Запись в файл
        Files.write(path, Collections.singletonList("Hello, World!"), StandardOpenOption.APPEND);  // записываем строку в конец файла
    }

    // Задание 3: Работа с пользовательским вводом
    public static void task3() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();  // считываем имя пользователя

        Path path = Paths.get("username.txt");
        Files.write(path, Collections.singletonList(name));  // записываем имя в файл

        String readName = Files.readAllLines(path).get(0);  // читаем имя из файла
        System.out.println("Hello, " + readName + "!");
    }

    // Задание 4: Комбинированные операции
    public static void task4() throws IOException {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

        List<String> result = words.stream()
                .map(String::toUpperCase)  // преобразуем каждую строку в верхний регистр
                .filter(s -> s.length() > 3)  // отфильтровываем строки длиной более 3 символов
                .collect(Collectors.toList());  // собираем результат в список

        Path path = Paths.get("output.txt");
        Files.write(path, result);  // записываем строки в новый файл
    }

    // Задание 5: Обработка исключений
    public static void task5() {
        Path path = Paths.get("nonexistent.txt");

        try {
            List<String> lines = Files.readAllLines(path);  // пытаемся прочитать несуществующий файл
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());  // обрабатываем исключение и выводим сообщение об ошибке
        }
    }
}
