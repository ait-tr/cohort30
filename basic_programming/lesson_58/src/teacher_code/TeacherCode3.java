package teacher_code;

public class TeacherCode3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("1  Thread + " + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread1.start();

        //thread1.join(3000); // рвносильна Thread.sleep(3000);
        // основной поток main дождется, когда поток thread1 заврешится полностью и только после этого
        // продолжит свою работу:
        thread1.join();

        for (int i = 0; i < 5; i++) {
            System.out.println("2  Main + " + i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
