package teacher_code;

import java.util.concurrent.*;

public class ScheduledThreadPoolExecutorExample {

    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        scheduledExecutorService.scheduleAtFixedRate(
                () -> System.out.println("Periodic task execution"),
                2,
                1,
                TimeUnit.SECONDS
        );

        // Allow the periodic task to execute a few times before shutdown
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            scheduledExecutorService.shutdown();
        }
    }
}
