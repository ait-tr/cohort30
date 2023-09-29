package practice.serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializationExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");

        String filePath = "basic_programming/lesson_57/src/practice/serializable/list.txt";

        // Сериализация коллекции
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(list);
            System.out.println("Список успешно сериализован!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация коллекции
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            List<String> deserializedList = (List<String>) ois.readObject();
            System.out.println("Список успешно десериализован!");
            System.out.println(deserializedList);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

