package teacher_code;

import java.util.Random;
import java.util.concurrent.*;

public class ExampleExceptionHandler {
    public static void main(String[] args) {
        // Создаем пул потоков
        ExecutorService executorService = Executors.newFixedThreadPool(2, new CustomThreadFactory());
        // Отправляем задачу на выполнение
        Runnable r = new ExceptionThrowingTask();

        executorService.execute(r);
        executorService.execute(r);
        executorService.execute(r);
        executorService.execute(r);

        // Завершаем работу пула потоков после выполнения всех задач
        executorService.shutdown();
    }

    static class ExceptionThrowingTask implements Runnable {
        @Override
        public void run() {

//            throw new RuntimeException("Произошло исключение в потоке!");
            Random random = new Random();
            int x = random.nextInt(5);
            if (x < 1) {
                x = 10 / 0;
            } else if (x < 2) {
                "hello".charAt(100);
            } else {
                new RuntimeException("dasda");
            }

        }
    }

    static class CustomThreadFactory implements ThreadFactory {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            // Устанавливаем обработчик неотловленных исключений
            thread.setUncaughtExceptionHandler(new CustomUncaughtExceptionHandler());
            return thread;
        }
    }

    static class CustomUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println("Поток " + t.getName() + " выбросил исключение: " + e.getMessage());
        }
    }
}