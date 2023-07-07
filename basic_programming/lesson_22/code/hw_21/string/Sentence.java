package hw_21.string;

public class Sentence {
    public static void main(String[] args) {
//        Дано предложение: "Казнить нельзя помиловать".
//        - Поменяйте первое и последнее слово в нем местами;
//        - добавьте в него запятую на нужном месте и выведите на печать.

        String str = "казнить нельзя помиловать";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        // переставляем слова в массиве
        String temp = words[0];
        words[0] = words[2];
        words[2] = temp;
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        // добавляем "," к нужному слову
        String comma = ",";
        words[0] = words[0] + comma;
        System.out.println();
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
