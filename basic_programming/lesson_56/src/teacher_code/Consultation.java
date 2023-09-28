package teacher_code;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Consultation{
    // 1. immutable collections
    // 2. read and write files

    public static void main(String[] args) throws IOException{
        readFiles();
    }


    public static void readFiles() throws IOException {
        File file = new File("basic_programming/lesson_56/src/teacher_code/file.txt");

        if (!(file.exists() && file.isFile())) {
            throw new RuntimeException("its not a file!");
        }

        char[] message = "hello there!".toCharArray();

        FileOutputStream outputStream = new FileOutputStream(file);
        for (char c : message) {
            outputStream.write(c);
        }

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader, 2);

            System.out.println(reader.readLine());

        } catch (Exception e ) {
            throw new RuntimeException(e);
        }
    }

    public static void tryImmutable() {
        //изначально изменяемый
        List <String> arrayList = new ArrayList<String>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        arrayList.remove("one");
        arrayList.set(1, "four");
        System.out.println(arrayList);

        //изначально не изменяемый (можем только читать из этого листа)
        List<String> immutable = List.of("one", "two", "three");
        System.out.println("immutable: " + immutable);

        //List<String> becameImmutable = Collections.unmodifiableList(arrayList);
        //becameImmutable.clear();

        // метод unmodifiableList создает неизменяемый лист на основе того листа, который приходит в аргументы метода
        arrayList = Collections.unmodifiableList(arrayList);
        //arrayList.add(null);


        System.out.println(arrayList.get(0));

        System.out.println("becameImmutable: " + arrayList);


        System.out.println(immutable.stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println(immutable);
    }
}
