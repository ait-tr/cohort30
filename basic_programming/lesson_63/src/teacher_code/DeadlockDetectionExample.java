package teacher_code;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DeadlockDetectionExample {
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public static void checkForDeadlocks() {
        ThreadMXBean threadMxBean = ManagementFactory.getThreadMXBean();
        long[] threadIds = threadMxBean.findDeadlockedThreads();

        if (threadIds != null) {
            ThreadInfo[] threadInfos = threadMxBean.getThreadInfo(threadIds);
            System.out.println("Detection Deadlock:");

            for (ThreadInfo threadInfo : threadInfos) {
                System.out.println(threadInfo.getThreadId() + " - " + threadInfo.getThreadName());
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("Thread1 holds lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignore) {
                }
                synchronized (lock2) {
                    System.out.println("Thread1 holds lock2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("Thread2 holds lock2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignore) {
                }
                synchronized (lock1) {
                    System.out.println("Thread2 holds lock1");
                }
            }
        });

        thread1.start();
        thread2.start();

        // Периодическая проверка наличия дедлока
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignore) {
                }
                checkForDeadlocks();
            }
        }).start();
    }
}
