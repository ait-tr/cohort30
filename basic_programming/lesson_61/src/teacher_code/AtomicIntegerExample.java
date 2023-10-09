package teacher_code;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    private static final AtomicInteger atomicInt = new AtomicInteger(0);

    public static void main(String[] args) {
        // Пример использования метода get():
        System.out.println("Initial Value: " + atomicInt.get());

        // Пример использования метода addAndGet(int delta):
        System.out.println("Add 5: " + atomicInt.addAndGet(5));

        // Пример использования метода getAndAdd(int delta):
        System.out.println("Add 3 and get old value: " + atomicInt.getAndAdd(3));

        // Пример использования метода incrementAndGet():
        System.out.println("Increment and get new value: " + atomicInt.incrementAndGet());

        // Пример использования метода getAndIncrement():
        System.out.println("Increment and get old value: " + atomicInt.getAndIncrement());

        // Пример использования метода compareAndSet(int expect, int update):
        boolean isSet = atomicInt.compareAndSet(9, 10); // Сравнивает текущее значение с ожидаемым и, если они равны, устанавливает новое значение
        System.out.println("Compare and set successful: " + isSet + " | Value: " + atomicInt.get());

        // Пример использования метода decrementAndGet():
        System.out.println("Decrement and get new value: " + atomicInt.decrementAndGet());

        // Пример использования метода getAndDecrement():
        System.out.println("Decrement and get old value: " + atomicInt.getAndDecrement());

        // Пример использования метода getAndSet(int newValue):
        System.out.println("Set to 100 and get old value: " + atomicInt.getAndSet(100));

        // Финальное значение:
        System.out.println("Final Value: " + atomicInt.get());
    }
}
