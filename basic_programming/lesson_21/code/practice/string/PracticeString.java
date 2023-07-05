package practice.string;

import java.util.Arrays;

public class PracticeString {
    public static void main(String[] args) {

        String str = "Ich liebe Java sehre stark!";
        System.out.println("String: " + str);

        String[] words = str.split(" "); // разделяем строку на слова, потому что разделителем является " " (пробел)
        int n = words.length;
        System.out.println("Quantity of words in the string: " + n);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        String[] simbols = str.split(""); // разделяем строку на символы, потому что разделителем является "" (слитно)
        int m = simbols.length;
        System.out.println("Quantity of simbols in the string: " + m);
        for (int i = 0; i < simbols.length; i++) {
            System.out.print(simbols[i] + " | ");
        }

    }
}
