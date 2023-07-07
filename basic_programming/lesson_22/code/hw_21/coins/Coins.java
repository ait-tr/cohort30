package hw_21.coins;

public class Coins {
    public static void main(String[] args) {
//        На столе лежат n монеток. Некоторые из них лежат вверх решкой, а некоторые – гербом.
//        Определите минимальное число монеток, которые нужно перевернуть, чтобы все монетки были
//        повернуты вверх одной и той же стороной.

        int size = 20;
        int[] coin = new int[size];
        int m = 1;
        int n = 0;

        // заполняем массив случайными числами 0 или 1
        for (int i = 0; i < coin.length; i++) {
            coin[i] = (int)(Math.random() * (m - n + 1) + n);
            System.out.print(coin[i] + " ");
        }
        System.out.println();

        // считаем, сколько в массиве 0 и сколько 1
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < coin.length; i++) {
            if (coin[i] == 0 ){
                count0++;
            } else {
                count1++;
            }
        }

        if (count0 > count1) {
            System.out.println("You have to turn coins tails up.");
        } else {
            System.out.println("You have to turn coins arm up.");
        }

    }
}
