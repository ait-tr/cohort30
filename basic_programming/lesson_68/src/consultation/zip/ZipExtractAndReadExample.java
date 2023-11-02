package consultation.zip;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipExtractAndReadExample {
    public static void main(String[] args) {
        String zipFilePath = "basic_programming/lesson_68/src/consultation/zip/archive.zip";

        // Распаковываем архив и читаем текстовые файлы
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry zipEntry;
            while ((zipEntry = zis.getNextEntry()) != null) {
                // Проверяем, что в архиве находится файл, а не директория
                if (!zipEntry.isDirectory()) {
                    // Для наглядности выводим информацию о файле
                    System.out.println("Файл в архиве: " + zipEntry.getName());

                    // Читаем содержимое файла
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zis));
                    String line;
                    System.out.println("Содержимое файла:");
                    while ((line = bufferedReader.readLine()) != null) {
                        System.out.println(line);
                    }
                    System.out.println("Конец содержимого файла.");
                }
                zis.closeEntry();
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из архива: " + e.getMessage());
        }
    }
}

