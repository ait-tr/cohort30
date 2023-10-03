package homework;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork58 {

    public static void main(String[] args) {
        String pathToFile1 = "basic_programming/lesson_59/src/homework/file1.txt";
        String pathToFile2 = "basic_programming/lesson_59/src/homework/file2.txt";

        // Создаем два потока
        Thread thread1 = createPrintingThread(pathToFile1);
        Thread thread2 = createPrintingThread(pathToFile2);

        thread1.start();
        thread2.start();
    }

    /**
     * Создает поток, который построчно читает содержимое файла, выводит его в консоль
     * и засыпает на 10 мс после каждой строки.
     *
     * @param filePath Строка, содержащая путь до файла.
     * @return Поток, выполняющий чтение файла и вывод его содержимого.
     */

    public static Thread createPrintingThread(String filePath) {
        return new Thread(() -> {
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.err.println("Thread was interrupted");
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
