package teacher_code;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CounterExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Создаем и запускаем потоки, которые увеличивают счетчик
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Выводим итоговое значение счетчика
        System.out.println("Final Counter Value: " + counter.getValue());
    }
}

class Counter {
    private  int count = 0;

    // Синхронизированный метод для увеличения счетчика
    public void increment() {
        count++;
    }

    // Синхронизированный метод для получения значения счетчика
    public int getValue() {
        return count;
    }
}