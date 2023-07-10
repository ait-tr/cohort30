package practice.array;

public class ArrayMethods {

    public int sumElOfArray(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i]; // накапливаем сумму элементов
            }
        return sum;
    }

    public int sumElOfOddIndex (int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {
                sum = sum + arr[i]; // накапливаем сумму элементов c НЕчетными индексами
            }
        }
        return sum;
    }


}
