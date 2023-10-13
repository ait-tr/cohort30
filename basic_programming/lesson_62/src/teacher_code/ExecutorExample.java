package teacher_code;

import java.util.concurrent.Executor;

public class ExecutorExample {

    public static void main(String[] args) {
        Executor executor = command -> new Thread(command).start();

        executor.execute(() -> {
            try {
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getId() + " - first task. Priority: " + Thread.currentThread().getPriority());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executor.execute(() -> System.out.println(Thread.currentThread().getId() + " second task. Priority: " + Thread.currentThread().getPriority()));
        executor.execute(() -> {
            Thread.currentThread().setPriority(8);
            System.out.println(Thread.currentThread().getId() + " third task. Priority: " + Thread.currentThread().getPriority());
        });
        executor.execute(() -> System.out.println(Thread.currentThread().getId() + " fours task. Priority: " + Thread.currentThread().getPriority()));
        executor.execute(() -> System.out.println(Thread.currentThread().getId() + " fives task. Priority: " + Thread.currentThread().getPriority()));

        System.out.println(Thread.currentThread().getId() + " - finish. Priority: " + Thread.currentThread().getPriority());
    }
}