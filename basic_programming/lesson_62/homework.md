# Домашнее задание по теме "Многопоточность в Java: Пулы потоков"

## Задача 1: Многопоточный счетчик с использованием пула потоков

### Условие:

Используя `AtomicInteger` и `ExecutorService`, создайте многопоточный счетчик, который будет увеличиваться и уменьшаться разными потоками из пула потоков.

### Пример:

Вход: Пул потоков, в котором 3 потока инкрементируют счетчик 5_000 раз, и 5 потоков декрементируют счетчик 3_000 раз.
Выход: Финальное значение счетчика (0, если всё было синхронизировано корректно).

<details>
<summary>Основа для решения:</summary>

```java
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CounterExample {

    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // Создаем пул потоков
        ExecutorService executorService = Executors.newFixedThreadPool(8);

        // Создаем инкрементирующие задачи
        Runnable incrementTask = () -> {
            for (int i = 0; i < 5000; i++) {
                counter.incrementAndGet();
            }
        };

        // Создаем декрементирующие задачи
        Runnable decrementTask = () -> {
            for (int i = 0; i < 3000; i++) {
                counter.decrementAndGet();
            }
        };

        // Добавляем задачи в пул потоков
        for (int i = 0; i < 3; i++) {
            executorService.submit(incrementTask);
        }
        for (int i = 0; i < 5; i++) {
            executorService.submit(decrementTask);
        }
        
        // Завершаем работу пула потоков
        executorService.shutdown();
        
        // Дожидаемся завершения всех потоков
        while (!executorService.isTerminated()) {
            // Ждем завершения всех задач
        }
        
        // Выводим финальное значение счетчика
        System.out.println("Final Counter Value: " + counter.get());
    }
}
```
</details>