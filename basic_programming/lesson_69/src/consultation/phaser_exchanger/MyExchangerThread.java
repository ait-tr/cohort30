package consultation.phaser_exchanger;

import java.util.concurrent.Exchanger;

public class MyExchangerThread implements Runnable {
    Exchanger<String> exchanger;
    String object;

    MyExchangerThread(Exchanger<String> exchanger, String object) {
        this.exchanger = exchanger;
        this.object = object;
    }

    public void run() {
        try {
            // Обмен данными
            String previous = this.object;
            this.object = exchanger.exchange(this.object);
            System.out.println(Thread.currentThread().getName() +
                    " обменял " + previous + " на " + this.object);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}