package homework;

import java.util.*;

public class HomeWork55 {

    /**
     * В данном примере:
     *
     * Provider создает и возвращает новый список целых чисел.
     * Condition проверяет, является ли число четным.
     * Action удваивает значение элемента списка.
     * В main методе, мы применяем Action к каждому элементу списка, если элемент удовлетворяет Condition.
     * В конце, мы выводим измененный список на консоль.
     * @param args
     */

    public static void main(String[] args) {

        // Создаем провайдер, который возвращает новый список целых чисел
        Provider<List<Integer>> listProvider = () -> new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Получаем список
        List<Integer> list = listProvider.provide();

        // Создаем условие, которое проверяет, является ли число четным
        Condition<Integer> isEven = (n) -> n % 2 == 0;

        // Создаем действие, которое удваивает значение элемента
        Action<Integer> doubleValue = (n) -> {
            int index = list.indexOf(n);
            if (index != -1) {
                list.set(index, n * 2);
            }
        };

        // Применяем действие к каждому элементу списка, если оно удовлетворяет условию
        for(Integer i : list) {
            if(isEven.test(i)) {
                doubleValue.execute(i);
            }
        }

        // Выводим результат
        System.out.println(list);  // Output: [1, 4, 3, 8, 5]
    }

    @FunctionalInterface
    interface Action<T> {
        void execute(T t);
    }

    @FunctionalInterface
    interface Condition<T> {
        boolean test(T t);
    }

    @FunctionalInterface
    interface Provider<R> {
        R provide();
    }
}

