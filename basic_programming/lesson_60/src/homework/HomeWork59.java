package homework;


public class HomeWork59 {

    public static void main(String[] args) {
        // Создаем первый поток с именем "Thread-1" и приоритетом 5
        Thread thread1 = new Thread(() -> {
            while (true) {
                // Выводим имя потока и его приоритет в консоль
                System.out.println(Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority());
            }
        }, "Thread-1");
        thread1.setPriority(5); // Устанавливаем приоритет потока

        // Аналогично создаем второй поток с именем "Thread-2" и приоритетом 3
        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority());
            }
        }, "Thread-2");
        thread2.setPriority(3);

        // И третий поток с именем "Thread-3" и приоритетом 8
        Thread thread3 = new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + ", Priority: " + Thread.currentThread().getPriority());
            }
        }, "Thread-3");
        thread3.setPriority(8);

        // Запускаем потоки
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

