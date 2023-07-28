package ait.arays.utils;
// набор методов для работы с массивами

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools implements Comparable<ArrayTools>{

    // print array
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n============================");
    }

    // find index of searched element
    public static int search(Object[] arr, Object value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    // поиск с условием (предикатом)
    public static <T> T findByPredicat(T[] arr, Predicate<T> predicate) {
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                return arr[i];
            }
        }
        return null;
    }

    // сортировка массива методом bubbleSort
    // метод работает с дженериком(параметром)
    // параметр T должен быть сортируемым, то есть в нем должен быть реализован интерфейс (метод) для сортировки
    //
    public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1])  > 0) { // сравниваем соседние элементы
                    // меняем элементы массива
                    // местами
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }


    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        int n1, n2;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare(arr[j], arr[j+1]) > 0) { // сравниваем соседние элементы
                    // меняем элементы массива
                    // местами
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static <T> void arrayOddEvenSort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare(arr[j] , arr[j+1]) > 0) { // сравниваем соседние элементы
                    // меняем элементы массива
                    // местами
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    // компаратор
    @Override
    public int compareTo(ArrayTools o) {
        return 0;
    }
}
