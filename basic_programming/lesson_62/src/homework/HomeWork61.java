package homework;

import java.util.concurrent.atomic.AtomicInteger;

public class HomeWork61 {
    // Объект AtomicInteger предоставляет возможность работы с целочисленными значениями,
    // методы которого атомарны, что позволяет использовать его в многопоточной среде
    // без использования 'synchronized'.
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // Создаем и запускаем инкрементирующие потоки
        Thread incThread1 = createIncrementingThread(5000);
        Thread incThread2 = createIncrementingThread(5000);
        Thread incThread3 = createIncrementingThread(5000);
        incThread1.start();
        incThread2.start();
        incThread3.start();

        // Создаем и запускаем декрементирующие потоки
        Thread decThread1 = createDecrementingThread(3000);
        Thread decThread2 = createDecrementingThread(3000);
        Thread decThread3 = createDecrementingThread(3000);
        Thread decThread4 = createDecrementingThread(3000);
        Thread decThread5 = createDecrementingThread(3000);
        decThread1.start();
        decThread2.start();
        decThread3.start();
        decThread4.start();
        decThread5.start();

        // Дожидаемся завершения потоков, чтобы убедиться, что они все закончили свою работу
        // перед тем как вывести финальное значение счетчика.
        try {
            incThread1.join();
            incThread2.join();
            incThread3.join();
            decThread1.join();
            decThread2.join();
            decThread3.join();
            decThread4.join();
            decThread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Выводим финальное значение счетчика.
        System.out.println("Final Counter Value: " + counter.get());
    }

    // Метод для создания и возврата потока, который инкрементирует счетчик
    // заданное количество раз.
    private static Thread createIncrementingThread(int incrementTimes) {
        return new Thread(() -> {
            for (int i = 0; i < incrementTimes; i++) {
                counter.incrementAndGet();
            }
        });
    }

    // Метод для создания и возврата потока, который декрементирует счетчик
    // заданное количество раз.
    private static Thread createDecrementingThread(int decrementTimes) {
        return new Thread(() -> {
            for (int i = 0; i < decrementTimes; i++) {
                counter.decrementAndGet();
            }
        });
    }
}
