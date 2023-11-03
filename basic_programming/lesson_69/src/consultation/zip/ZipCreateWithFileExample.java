package consultation.zip;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipCreateWithFileExample {
    public static void main(String[] args) {
        String dirPath = "basic_programming/lesson_68/src/consultation/zip/";
        String sourceFileName = "test.txt";
        String sourceFilePath = dirPath + sourceFileName;
        String zipFileName = "archive.zip";
        String zipFilePath = dirPath + zipFileName;

        // Создаем текстовый файл с определенным содержимым
        try {
            Files.createDirectories(Paths.get(dirPath)); // Создаем директорию, если она еще не существует
            FileWriter fileWriter = new FileWriter(sourceFilePath);
            fileWriter.write("практика архивации\nпросто чтобы проверить, что будет несколько строк");
            fileWriter.close();
            System.out.println("Файл успешно создан.");
        } catch (IOException e) {
            System.err.println("Ошибка при создании файла: " + e.getMessage());
            return;
        }

        // Упаковываем созданный файл в архив
        try (ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(Paths.get(zipFilePath)))) {
            zos.putNextEntry(new ZipEntry(sourceFileName));
            byte[] bytes = Files.readAllBytes(Paths.get(sourceFilePath));
            zos.write(bytes, 0, bytes.length);
            zos.closeEntry();
            System.out.println("Файл успешно упакован в архив.");
        } catch (IOException e) {
            System.err.println("Ошибка при архивации файла: " + e.getMessage());
        }
    }
}

