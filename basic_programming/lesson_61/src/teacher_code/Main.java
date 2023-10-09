package teacher_code;

import java.util.concurrent.atomic.AtomicLong;

class Counter {
    private final AtomicLong value = new AtomicLong(0);  // Изначальное значение

    public void increment() {
        long oldValue, newValue;
        do {
            oldValue = value.get();  // Получаем текущее значение
            newValue = oldValue + 1;  // Увеличиваем его на 1
        } while (!value.compareAndSet(oldValue, newValue));  // Пытаемся установить новое значение. Если текущее значение не равно oldValue, начинаем сначала
    }

    public long getValue() {
        return value.get();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000_000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000_000; i++) {
                counter.increment();
            }
        });

        long start = System.nanoTime();

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final counter value: " + counter.getValue() + ". Time: " + (System.nanoTime() - start));  // Выводит 2000, если все инкременты прошли успешно
    }
}

// 168881959  167530833  172866583  168077875  172934334
// 134313583  146709209  142143708  127764625  156678708
//  67013375   69622209   55980958   71428667   54052166