package teacher_code;

import java.util.concurrent.Executor;

public class ExecutorExample {

    public static void main(String[] args) {
        Executor executor = command -> new Thread(command).start();

        executor.execute(() -> {
            try {
                Thread.sleep(3000);
                System.out.println("first task");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executor.execute(() -> System.out.println("second task"));

        System.out.println("finish");
    }
}