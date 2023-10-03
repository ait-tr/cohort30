package practice;

public class LectionTwo {

    public static void main(String[] args) {
        // Вызываем каждый метод (задачу) по очереди
        task1_setThreadNameAndPriority();
        task2_daemonThreadExample();
        task3_useSleepMethod();
        task4_handleInterruptedException();
        task5_checkForInterruption();
        task6_demonstrateIsInterrupted();
        task7_resetInterruptedStatus();
    }

    // Задача 1: Имена потоков и приоритеты
    private static void task1_setThreadNameAndPriority() {
        // Создаем новый поток и устанавливаем его имя и приоритет
        Thread thread = new Thread(() -> {
            // Получаем и выводим имя текущего потока и его приоритет
            System.out.println("Thread Name: " + Thread.currentThread().getName());
            System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
        });

        // Устанавливаем имя и приоритет
        thread.setName("MyThread");
        thread.setPriority(Thread.MAX_PRIORITY); // Максимальный приоритет

        // Запускаем поток
        thread.start();
    }

    // Задача 2: Потоки-демоны
    private static void task2_daemonThreadExample() {
        // Создаем поток-демон, который завершится, когда завершатся все недемоны
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon is working...");
            }
        });
        // Устанавливаем поток как демон
        daemonThread.setDaemon(true);
        // Запускаем поток
        daemonThread.start();
    }

    // Задача 3: Использование метода sleep()
    private static void task3_useSleepMethod() {
        // Создаем и запускаем поток, который будет "спать" 2000 мс
        new Thread(() -> {
            try {
                System.out.println("Thread is sleeping...");
                Thread.sleep(2000);
                System.out.println("Thread woke up!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    // Задача 4: Обработка InterruptedException (например, при использовании sleep())
    private static void task4_handleInterruptedException() {
        // Создаем и запускаем поток, который будет "спать" и обрабатывать прерывания
        new Thread(() -> {
            try {
                System.out.println("Thread is sleeping...");
                Thread.sleep(10000); // Устанавливаем большой таймер, чтобы иметь возможность прервать
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted during sleep!");
            }
        }).start();
    }

    // Задача 5: Проверка на прерывание потока
    private static void task5_checkForInterruption() {
        // Создаем и запускаем поток, который проверит, был ли он прерван
        Thread thread = new Thread(() -> {
            // Проверяем, не прерван ли поток
            if (!Thread.interrupted()) {
                System.out.println("Thread is not interrupted!");
            } else {
                System.out.println("Thread is interrupted!");
            }
        });
        // Прерываем поток
        thread.interrupt();
        thread.start();
    }

    // Задача 6: Демонстрация метода isInterrupted()
    private static void task6_demonstrateIsInterrupted() {
        // Создаем и запускаем поток, который проверит свой статус прерывания
        Thread thread = new Thread(() -> {
            // Бесконечный цикл, чтобы иметь возможность прервать поток вручную, например, из IDE
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread is interrupted!");
                    break;
                }
            }
        });
        // Запускаем поток
        thread.start();
        // Через 2 секунды прерываем поток
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                thread.interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    // Задача 7: Сброс флага прерывания
    private static void task7_resetInterruptedStatus() {
        // Создаем и запускаем поток
        Thread thread = new Thread(() -> {
            // Бесконечный цикл, чтобы иметь возможность прервать поток вручную, например, из IDE
            while (true) {
                if (Thread.interrupted()) {
                    System.out.println("Thread is interrupted! Resetting status...");
                    // Сбрасываем флаг прерывания
                    Thread.currentThread().interrupt();
                }
                // Проверяем статус снова
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread is still interrupted!");
                    break;
                }
            }
        });
        // Запускаем поток
        thread.start();
        // Через 2 секунды прерываем поток
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                thread.interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
