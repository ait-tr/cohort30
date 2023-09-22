package homework;

import java.util.HashMap;
import java.util.Scanner;

public class LanguageCard {

    private HashMap<String, String> wordMap = new HashMap<>();  // Словарь для хранения пар слово-перевод
    private HashMap<String, Integer> mistakeCountMap = new HashMap<>();  // Словарь для хранения количества ошибок по каждому слову
    private static Scanner scanner = new Scanner(System.in);  // Сканер для чтения ввода пользователя

    public void addWord(String foreignWord, String nativeWord) {
        wordMap.put(foreignWord, nativeWord);  // Добавление пары слово-перевод в словарь
    }

    public void practice() {
        if (wordMap.isEmpty()) {  // Проверка, есть ли слова для практики
            System.out.println("Словарь пуст. Пожалуйста, добавьте слова для практики.");
            return;
        }

        for (String key : wordMap.keySet()) {  // Проход по всем словам в словаре
            if (checkAnswer(key)) {  // Проверка ответа пользователя
                System.out.println("Верно!");
            } else {
                while (true) {  // Цикл продолжается, пока пользователь не решит прекратить попытки
                    addWordToMistakeCountMap(key);  // Учет ошибочного ответа
                    System.out.println("Не верно. Хотите совершить еще одну попытку? да/нет");
                    String tryAgain = scanner.nextLine();
                    if (!tryAgain.equalsIgnoreCase("да")) {
                        break;  // Выход из цикла, если пользователь не хочет повторять попытку
                    } else {
                        if (checkAnswer(key)) {  // Проверка повторного ответа пользователя
                            System.out.println("Верно!");
                            break;
                        }
                    }
                }
            }
        }
    }

    public void practiceDifficultWord() {
        if (mistakeCountMap.isEmpty()) {  // Проверка, есть ли слова с ошибками
            System.out.println("У вас нет слов с ошибками");
            return;
        }

        for (String key : mistakeCountMap.keySet()) {  // Проход по всем словам с ошибками
            if (checkAnswer(key)) {  // Проверка ответа пользователя
                System.out.println("Верно!");
                mistakeCountMap.remove(key);  // Удаление слова из списка ошибок при верном ответе
            } else {
                while (true) {  // Аналогичный цикл, как в методе practice, для повторения попыток
                    addWordToMistakeCountMap(key);  // Учет ошибочного ответа
                    System.out.println("Не верно. Хотите совершить еще одну попытку? да/нет");
                    String tryAgain = scanner.nextLine();
                    if (!tryAgain.equalsIgnoreCase("да")) {
                        break;
                    } else {
                        if (checkAnswer(key)) {
                            System.out.println("Верно!");
                            mistakeCountMap.remove(key);  // Удаление слова из списка ошибок при верном ответе
                            break;
                        }
                    }
                }
            }
        }
    }

    private boolean checkAnswer(String key) {
        System.out.println("Каков перевод слова " + key + "?");
        String userAnswer = scanner.nextLine();  // Получение ответа от пользователя
        return userAnswer.equalsIgnoreCase(wordMap.get(key));  // Сравнение ответа пользователя с правильным переводом, игнорируя регистр
    }

    private void addWordToMistakeCountMap(String key) {
        if (!mistakeCountMap.containsKey(key)) {  // Проверка, есть ли уже запись об ошибке для данного слова
            mistakeCountMap.put(key, 1);  // Если нет, создание новой записи с одной ошибкой
        } else {
            int counts = mistakeCountMap.get(key);  // Если есть, получение текущего количества ошибок
            counts++;
            mistakeCountMap.put(key, counts);  // Увеличение количества ошибок на 1 и обновление записи в словаре
        }
    }

    public static void main(String[] args) {
        LanguageCard myCard = new LanguageCard();  // Создание объекта класса LanguageCard

        myCard.addWord("apple", "яблоко");  // Добавление слов в словарь
        myCard.addWord("dog", "собака");
        myCard.addWord("hello", "привет");

        myCard.practice();  // Запуск метода практики
        myCard.practiceDifficultWord(); // Запуск метода практики слов с ошибками
    }
}
