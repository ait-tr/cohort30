package teacher_code;

import java.io.IOException;
import java.util.concurrent.*;

public class Example {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<?> futureTask = executorService.submit(new LongRunningTask());

        try {
            // Попытаемся получить результат выполнения задачи в течение 2 секунд
            futureTask.get(2, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            // Задача не завершилась в течение 2 секунд
            System.out.println("Задача выполняется слишком долго. Попытка ее отменить...");
            futureTask.cancel(true); // Попытка отменить задачу
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }


        executorService.shutdown();
    }

    static class LongRunningTask implements Runnable {
        @Override
        public void run() {
            try {
                // Эмулируем долгую задачу, выполняющуюся 5 секунд
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Задача была прервана!");
            }
        }
    }
}
