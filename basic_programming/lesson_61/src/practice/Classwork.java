package practice;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

public class Classwork {

    public static void main(String[] args) {
        Classwork cw = new Classwork();
        cw.task1AtomicInteger();
        cw.task2AtomicArray();
        cw.task3CopyOnWriteArrayList();
        cw.task4ConcurrentHashMap();
        cw.task5BlockingQueue();
    }

    // Задача 1: Использование AtomicInteger для инкремента и декремента значения в многопоточной среде.
    void task1AtomicInteger() {
        AtomicInteger atomicInt = new AtomicInteger(0);

        // Создайте несколько потоков, которые будут инкрементировать и декрементировать значение atomicInt.
        // Убедитесь, что обновленное значение является правильным, после выполнения всех потоков.
    }

    // Задача 2: Использование AtomicReferenceArray для управления массивом объектов в многопоточной среде.
    void task2AtomicArray() {
        AtomicReferenceArray<String> atomicArray = new AtomicReferenceArray<>(10);

        // Создайте потоки, которые будут изменять различные индексы atomicArray и убедитесь, что чтение данных
        // происходит корректно.
    }

    // Задача 3: Использование CopyOnWriteArrayList для безопасной записи во время итерирования.
    void task3CopyOnWriteArrayList() {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

        // Придумайте сценарий, где несколько потоков читают и пишут в список одновременно.
    }

    // Задача 4: Использование ConcurrentHashMap для хранения и извлечения пар ключ-значение в многопоточной среде.
    void task4ConcurrentHashMap() {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        //  Создайте сценарий, где несколько потоков добавляют, удаляют и читают пары ключ-значение одновременно,
        // не используя явные блокировки.
    }

    // Задача 5: Использование BlockingQueue для потокобезопасного добавления и извлечения объектов.
    void task5BlockingQueue() {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        // Создайте производителя, который помещает объекты в очередь, и потребителя, который извлекает объекты из
        // очереди. Убедитесь, что потребитель может консумировать объекты правильно, даже если производитель добавляет их в
        // произвольные моменты времени.
    }
}
