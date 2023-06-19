package hw_13;
import java.util.Random;

public class sumOfOddElements {
    //Задача 1. Написать метод, принимающий массив целых чисел,
    //   и возвращающий сумму всех его нечетных элементов
    //  (не индексы!, а сами элементы).
    // Массив на 100 элементов задать случайными числами в интервале от 1 до 100.
        public static void main(String[] args) {
            // Создаем массив на 100 элементов и заполняем случайными числами от 1 до 100
            int[] array = new int[100];
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100) + 1; // Генерируем случайное число от 1 до 100
            }
            // Вызываем метод для расчета суммы нечетных элементов
            int sumOfOddElements = calculateSumOfOddElements(array);
            // Выводим результат
            System.out.println("Сумма нечетных элементов: " + sumOfOddElements);
        }
        // Метод для расчета суммы нечетных элементов массива
        public static int calculateSumOfOddElements(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) { // Проверяем, является ли элемент нечетным
                    sum += array[i]; // Добавляем нечетный элемент к сумме
                }
            }
            return sum; // Возвращаем сумму нечетных элементов
        }
}
