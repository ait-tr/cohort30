package hw_14;

import java.util.Random;

public class LuckyDumpling {
    public static void main(String[] args) {
//        Задача 3.
//
//        Задача про поиск "счастливого пельменя",
//        часть 2. Хозяйка налепила для гостей 30 пельменей.
//        В один из пельменей она положила монету,
//        которая увеличивает вес пельменя на 15 грамм.
//        Напишите программу, которая ищет счастливый пельмень.

        int numberOfDumpling = 30;
        int minWeight = 25;
        int maxWeight = 35;
        int additionalWeight = 15;

        int[]  weight = new int[numberOfDumpling];

        Random random = new Random();

        for (int i = 0; i < numberOfDumpling; i++) {
            weight[i] = random.nextInt(maxWeight - minWeight + 1) + minWeight;
        }

        int luckyDumplingIndex = random.nextInt(numberOfDumpling);
        weight[luckyDumplingIndex] = weight[luckyDumplingIndex] + additionalWeight;

        for (int i = 0; i < numberOfDumpling; i++) {
            System.out.println("Weight of dumpling " + i + ": " + weight[i] + " grams");
        }

        System.out.println();

        System.out.println("Lucky dumpling found at index " + luckyDumplingIndex);
        System.out.println("Weight of the lucky dumpling: " +weight[luckyDumplingIndex] + " grams");

    }
}
