package teacher_code;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeacherCode2 {
    static List<String> words;

    public static void main(String[] args) {
        long generateTime = generateRandomWords(1_000_000);
        System.out.println("Single Thread Time: " + generateTime + "ms");

        long singleThreadTime = singleThread();
        System.out.println("Single Thread Time: " + singleThreadTime + "ms");

        long multiThreadTime = multiThread();
        System.out.println("Multi Thread Time: " + multiThreadTime + "ms");
    }

    static long generateRandomWords(int numberOfWords) {
        long start = System.currentTimeMillis();

        Random random = new Random();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < numberOfWords; i++) {
            // Генерация случайной длины слова от 5 до 10
            int wordLength = random.nextInt(6) + 5;
            StringBuilder word = new StringBuilder(wordLength);

            for (int j = 0; j < wordLength; j++) {
                word.append(alphabet.charAt(random.nextInt(alphabet.length())));
            }

            words.add(word.toString());
        }

        return System.currentTimeMillis() - start;
    }

    static long singleThread() {
        List<String> upper = new ArrayList<>(1_000_000);

        long start = System.currentTimeMillis();

        for (String word : words) {
            upper.add(word.toUpperCase());
        }

        return System.currentTimeMillis() - start;
    }

    static long multiThread() {
        int midpoint = words.size() / 2;
        List<String> upper1 = new ArrayList<>(midpoint);
        List<String> upper2 = new ArrayList<>(words.size() - midpoint);

        long start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < midpoint; i++) {
                upper1.add(words.get(i).toUpperCase());
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = midpoint; i < words.size(); i++) {
                upper2.add(words.get(i).toUpperCase());
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis() - start;
        return end;
    }
}
