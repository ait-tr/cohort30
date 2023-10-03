package teacher_code;

import java.util.ArrayDeque;
import java.util.Queue;

public class TeacherCode2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("1  Thread + " + i);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("2  Thread + " + i);
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        // потоки могут начать работу не последоательно, это связано с тем, что инициализация потоков занимает
        // определенное время и к тому моменту, когда thread2 будет уже работать, thread1 все еще может ждать
        // освобождения ресурсов для инициализации потока. Данный процесс абсолютно независим
        thread1.start();
        thread2.start();


        // данный цикл показывает, что выполнение кода в потоке мейн - тоже отдельный поток, то есть во премя выполнения
        // конкретно этого кода одновременно будут работать сразу 3 потока
        for (int i = 0; i < 5; i++) {
            System.out.println("3  Main + " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
