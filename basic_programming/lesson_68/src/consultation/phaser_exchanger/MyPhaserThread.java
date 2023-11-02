package consultation.phaser_exchanger;

import java.util.concurrent.Phaser;

public class MyPhaserThread implements Runnable {
    Phaser phaser;
    String name;

    MyPhaserThread(Phaser p, String n) {
        phaser = p;
        name = n;
        phaser.register(); // Регистрируем поток у phaser
    }

    public void run() {
        System.out.println("Поток " + name + " начинает первую фазу");
        phaser.arriveAndAwaitAdvance(); // Сигнализируем о достижении и ждем остальных

        // Пауза, чтобы не нарушать порядок вывода. Не обязательно для реального кода
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Поток " + name + " начинает вторую фазу");
        phaser.arriveAndAwaitAdvance(); // Сигнализируем о достижении второй фазы

        // и так далее для других фаз...

        phaser.arriveAndDeregister(); // Отмена регистрации после всех фаз
    }
}
