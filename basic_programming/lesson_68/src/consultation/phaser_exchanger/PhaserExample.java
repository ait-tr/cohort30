package consultation.phaser_exchanger;

import java.util.concurrent.Phaser;

/**
 * Phaser (фазер) представляет собой гибкий барьер, который может быть использован для синхронизации задач,
 * выполняющихся в разных потоках. Он подобен CyclicBarrier и CountDownLatch, но предоставляет больше гибкости.
 * <p>
 * Основные особенности Phaser:
 * <p>
 * Поддерживает динамическое добавление или удаление "сторон" (parties), которые представляют потоки. Может повторно
 * использоваться для нескольких фаз. Каждая фаза увеличивает счетчик фаз Phaser. Можно использовать для ожидания, пока
 * все потоки не завершат выполнение определенной фазы, после чего Phaser переходит к следующей фазе.
 */
public class PhaserExample {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // '1' для регистрации самого главного потока
        int currentPhase;

        new Thread(new MyPhaserThread(phaser, "A")).start();
        new Thread(new MyPhaserThread(phaser, "B")).start();
        new Thread(new MyPhaserThread(phaser, "C")).start();

        // Ждем завершения всех фаз
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + currentPhase + " завершена");

        // и так для каждой фазы...

        phaser.arriveAndDeregister(); // Уведомление о завершении всех фаз и отмена регистрации главного потока
    }
}



