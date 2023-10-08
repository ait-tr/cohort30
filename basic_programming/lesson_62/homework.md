# Домашнее задание по теме "Многопоточность в Java"

## Задача 1: Многопоточный счетчик

**Условие:**
Используя `AtomicInteger`, создайте многопоточный счетчик, который будет увеличиваться и уменьшаться разными потоками.

Пример:

Вход: 3 потока инкрементируют счетчик 5_000 раз, и 5 потоков декрементируют счетчик 3_000 раз.
Выход: Финальное значение счетчика (0, если всё было синхронизировано корректно).

<details>
<summary>Основа для решения:</summary>

```java
import java.util.concurrent.atomic.AtomicInteger;

public class Classwork {

    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // Инкрементирующие потоки
        Thread incThread1 = createIncrementingThread(5000);
        Thread incThread2 = createIncrementingThread(5000);
        Thread incThread3 = createIncrementingThread(5000);
        
        // Декрементирующие потоки
        Thread decThread1 = createDecrementingThread(3000);
        Thread decThread2 = createDecrementingThread(3000);
        Thread decThread3 = createDecrementingThread(3000);
        Thread decThread4 = createDecrementingThread(3000);
        Thread decThread5 = createDecrementingThread(3000);
        
        // Запуск потоков

        // Дожидаемся завершения потоков

        
        // Выводим финальное значение счетчика
        System.out.println("Final Counter Value: " + counter.get());
    }
    
    // Метод создания инкрементирующего потока
    private static Thread createIncrementingThread(int incrementTimes) {
        return null;
    }

    // Метод создания декрементирующего потока
    private static Thread createDecrementingThread(int decrementTimes) {
        return null;
    }
}

```

</details>