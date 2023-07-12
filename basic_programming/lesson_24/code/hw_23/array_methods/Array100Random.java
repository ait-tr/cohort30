package hw_23.array_methods;

public class Array100Random {
//        Создайте массив из 100 случайных целых чисел в интервале от -10 до 10.
//        Подсчитайте, сколько в этом массиве оказалось:
//        - положительных чисел;
//        - отрицательных чисел;
//        - четных чисел;
//        - нулей.


    // печатает массив
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

    // находим нули в массиве
    public int zeroCount (int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        return count;
    }

    // находим положительные числа
    public int positiveCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }
        return count;
    }

    // находит четные числа в массиве
    public int evenCount(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
