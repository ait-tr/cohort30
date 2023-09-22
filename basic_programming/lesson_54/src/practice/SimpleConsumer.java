package practice;

import java.util.Random;

public class SimpleConsumer {
    private SimpleManager manager;

    public SimpleConsumer(SimpleManager manager) {
        this.manager = manager;
    }

    public void listenQueue() throws InterruptedException {
        while (true) {
            Task task = manager.getTaskFromQueue();
            int time = new Random().nextInt(900, 1200);
            if (task != null) {
                System.out.printf("Execution %s,  time %5d ms Queue\n", task.getTaskName(), time);
            }
            Thread.sleep(time);
        }
    }

    public void listenStack() throws InterruptedException {
        while (true) {
            Task task = manager.getTaskFromStack();
            int time = new Random().nextInt(900, 1200);
            if (task != null) {
                System.out.printf("Execution %s,  time %5d ms Stack\n", task.getTaskName(), time);
            }
            Thread.sleep(time);
        }
    }
}
