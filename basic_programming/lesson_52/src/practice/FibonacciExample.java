package practice;

import java.util.HashMap;
import java.util.Collections;

public class FibonacciExample {
    // TreeMap для хранения ранее вычисленных значений последовательности Фибоначчи
    private static HashMap<Integer, Integer> cache = new HashMap<>();

    // Метод с мемоизацией и использованием цикла
    public static int fibMemoization(int n) {
        // Базовые случаи: 0 и 1
        if (n <= 1) {
            return n;
        }

        // Проверка, было ли число уже вычислено и сохранено в кэше
        if (cache.get(n) != null) {
            return cache.get(n);
        }

        int start = cache.isEmpty() ? 2 : Collections.max(cache.keySet()) + 1;

        int a = cache.getOrDefault(start - 2, 0);
        int b = cache.getOrDefault(start - 1, 1);

        // Вычисление числа Фибоначчи и сохранение промежуточных значений в кэше
        for (int i = start; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;

            // Сохранение вычисленного значения в кэше
            cache.put(i, b);
        }

        return b;
    }

    public static int fibLoop(int n) {
        // Базовые случаи: 0 и 1
        if (n <= 1) {
            return n;
        }

        int start = cache.isEmpty() ? 2 : Collections.max(cache.keySet()) + 1;

        int a = 0;
        int b = 1;

        // Вычисление числа Фибоначчи и сохранение промежуточных значений в кэше
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    public static void main(String[] args) {
        // Примеры использования

        int num = 20;

        long startMem = System.nanoTime();
        int memorizationFib = fibMemoization(num);
        long endMem = System.nanoTime();
        System.out.println("Fibonacci for " + num + " with Memoization: " + memorizationFib + " Operation took " + (endMem - startMem) + "ns");

        long startLoop = System.nanoTime();
        int loopFib = fibLoop(num);
        long endLoop = System.nanoTime();
        System.out.println("Fibonacci for " + num + " with Loop: " + loopFib + " Operation took " + (endLoop - startLoop) + "ns");

        num = 70;

        startMem = System.nanoTime();
        memorizationFib = fibMemoization(num);
        endMem = System.nanoTime();
        System.out.println("Fibonacci for " + num + " with Memoization: " + memorizationFib + " Operation took " + (endMem - startMem) + "ns");

        startLoop = System.nanoTime();
        loopFib = fibLoop(num);
        endLoop = System.nanoTime();
        System.out.println("Fibonacci for " + num + " with Loop: " + loopFib + " Operation took " + (endLoop - startLoop) + "ns");

        num = 60;

        startMem = System.nanoTime();
        memorizationFib = fibMemoization(num);
        endMem = System.nanoTime();
        System.out.println("Fibonacci for " + num + " with Memoization: " + memorizationFib + " Operation took " + (endMem - startMem) + "ns");

        startLoop = System.nanoTime();
        loopFib = fibLoop(num);
        endLoop = System.nanoTime();
        System.out.println("Fibonacci for " + num + " with Loop: " + loopFib + " Operation took " + (endLoop - startLoop) + "ns");

        num = 65;

        startMem = System.nanoTime();
        memorizationFib = fibMemoization(num);
        endMem = System.nanoTime();
        System.out.println("Fibonacci for " + num + " with Memoization: " + memorizationFib + " Operation took " + (endMem - startMem) + "ns");

        startLoop = System.nanoTime();
        loopFib = fibLoop(num);
        endLoop = System.nanoTime();
        System.out.println("Fibonacci for " + num + " with Loop: " + loopFib + " Operation took " + (endLoop - startLoop) + "ns");
    }
}

