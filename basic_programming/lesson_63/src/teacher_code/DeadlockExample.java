package teacher_code;

public class DeadlockExample {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Task(lock1, lock2)); // первый поток
        Thread thread2 = new Thread(new Task(lock2, lock1)); // второй поток

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("FINISH");
    }

    static class Task implements Runnable {
        private Object innerLock1;
        private Object innerLock2;

        public Task(Object lock1, Object lock2) {
            this.innerLock1 = lock1;
            this.innerLock2 = lock2;
        }

        @Override
        public void run() {
            synchronized (innerLock1) {
                System.out.println("Thread " + Thread.currentThread().getId() + ": locked " + innerLock1);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (innerLock2) {
                    System.out.println("Thread " + Thread.currentThread().getId() + ": locked " + innerLock2);
                }
            }
        }
    }
}
