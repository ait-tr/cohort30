package practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTasks {

    /**
     * Задача 1: Создание пула потоков и выполнение задачи
     *
     * Задача: Создайте пул потоков и выполните в нем простую задачу, которая выводит в консоль "Hello, World!".
     */
    public static void task1() {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Запуск задачи в пуле потоков

        // Завершение пула потоков

    }

    /**
     * Задача 2: Ожидание завершения всех задач
     *
     * Задача: Создайте пул потоков и запустите в нем несколько задач.
     * Дождитесь, пока все они не будут выполнены, и только потом продолжите выполнение основного потока.
     */
    public static void task2() {
        // Ваш код здесь
        // Создание пула потоков с тремя потоками
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Запуск нескольких задач в пуле потоков


        // Завершение пула потоков и ожидание завершения всех задач
        executor.shutdown();

    }

    /**
     * Задача 3: Получение результатов из Future
     *
     * Задача: Создайте пул потоков и запустите в нем задачу, которая возвращает результат.
     * Получите результат выполнения задачи из объекта Future и выведите его в консоль.
     */
    public static void task3() {
        // Ваш код здесь
    }

    /**
     * Задача 4: Ограничение количества потоков в пуле
     *
     * Задача: Создайте пул потоков с фиксированным числом потоков и запустите в нем больше задач, чем потоков.
     * Обратите внимание, как задачи выполняются (последовательно или параллельно).
     */
    public static void task4() {
        // Ваш код здесь
    }

    /**
     * Задача 5: Обработка исключений в потоках пула
     *
     * Задача: Создайте пул потоков и запустите в нем задачу, которая генерирует исключение.
     * Реализуйте механизм, который позволяет корректно обрабатывать исключения, возникшие в потоках пула.
     */
    public static void task5() {
        // Ваш код здесь
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
}

