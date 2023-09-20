package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ReadFileByWords {

    public static void main(String[] args) {
        List<String> words = readFileByWords("basic_programming/lesson_53/src/practice/file.txt");

        ArrayList<LinkedList<String>> buckets = new ArrayList<>(16);
        for (int i = 0; i < 16; i++) {
            buckets.add(new LinkedList<String>());
        }

        words.forEach(i -> buckets.get(i.hashCode() & 0xF).add(i));

        for (LinkedList<String> bucket : buckets) {
            System.out.println(bucket);
        }
    }

    public static List<String> readFileByWords(String filename) {
        List<String> wordList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");  // Разделяем строку на слова по пробелам
                wordList.addAll(Arrays.asList(words));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return wordList;
    }
}
