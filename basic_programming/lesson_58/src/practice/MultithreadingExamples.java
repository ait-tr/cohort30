package practice;


public class MultithreadingExamples {
    public static void main(String[] args) {
//        basicThreadExample();
//        threadSleepExample();
//        threadJoinExample();
//        runnableInterfaceExample();
    }

    /**
     * Демонстрирует базовое создание и запуск потока.
     */
    public static void basicThreadExample() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Running in a separate thread: " + i);
            }
        });

        thread.start();
    }

    /**
     * Демонстрирует режим ожидания потока с использованием метода Thread.sleep.
     */
    public static void threadSleepExample() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);  // sleeps for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Slept for 1 second: " + i);
            }
        });

        thread.start();
    }

    /**
     * Демонстрирует соединение потоков с помощью Thread.join метода.
     */
    public static void threadJoinExample() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Running in a separate thread: " + i);
            }
        });

        thread.start();

        try {
            thread.join();  // waits for this thread to die
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread resumes after the other thread completes.");
    }


    /**
     * Демонстрирует простое использование Runnable интерфейса.
     */
    public static void runnableInterfaceExample() {
        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Running in a separate Runnable: " + i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}

