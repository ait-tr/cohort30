package homework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;


public class HomeWork62 {

    // Объявление атомарного (thread-safe) счетчика
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // Создание пула потоков с 8 потоками
        ExecutorService executorService = Executors.newFixedThreadPool(8);

        // Создание задачи, которая увеличивает счетчик 5000 раз
        Runnable incrementTask = () -> {
            for (int i = 0; i < 5000; i++) {
                counter.incrementAndGet();  // Увеличение счетчика на 1
            }
        };

        // Создание задачи, которая уменьшает счетчик 3000 раз
        Runnable decrementTask = () -> {
            for (int i = 0; i < 3000; i++) {
                counter.decrementAndGet();  // Уменьшение счетчика на 1
            }
        };

        // Добавление инкрементирующих задач в пул потоков (3 задачи)
        for (int i = 0; i < 3; i++) {
            executorService.submit(incrementTask);
        }

        // Добавление декрементирующих задач в пул потоков (5 задач)
        for (int i = 0; i < 5; i++) {
            executorService.submit(decrementTask);
        }

        // Инициация остановки потоков после завершения выполнения задач
        executorService.shutdown();

        // Ожидание завершения всех потоков перед продолжением выполнения основного потока
        while (!executorService.isTerminated()) {
            // Цикл пуст, так как мы просто ожидаем завершения всех потоков
        }

        // Вывод финального значения счетчика в консоль
        System.out.println("Final Counter Value: " + counter.get());
    }
}
