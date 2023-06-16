package hw_12;

public class RandomNumbers {
    public static void main(String[] args) {
//        Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
//        Выведите массив на печать.
//        Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

        int[] num = new int[20];
        int a = 10, b = 20;

        for (int i = 0; i < num.length; i++) {
            num[i] = (int)(Math.random() * (b - a + 1) + a);
        }

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " | ");
        }
    }
}
