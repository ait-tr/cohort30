package teacher_code;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorExample {

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 4,
                60L, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2));

        executor.execute(() -> System.out.println("Task 1 is executed"));
        executor.execute(() -> System.out.println("Task 2 is executed"));

        executor.shutdown();
    }
}
