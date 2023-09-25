package homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Homework50 {
    public static void main(String[] args) {
        // Создаем первое множество и добавляем в него элементы
        Set<String> set1 = new HashSet<>();
        set1.add("один");
        set1.add("два");
        set1.add("три");
        set1.add("четыре");
        set1.add("пять");

        // Создаем второе множество и добавляем в него элементы
        Set<String> set2 = new HashSet<>();
        set2.add("четыре");
        set2.add("пять");
        set2.add("шесть");
        set2.add("семь");
        set2.add("восемь");

        // Вызываем метод для нахождения пересечения множеств и сохраняем результат в переменной resultSet
        Set<String> resultSet = intersectSets(set1, set2);

        // Выводим результат на экран
        System.out.println("Пересечение множеств: " + resultSet);
    }

    // Метод для нахождения пересечения двух множеств
    public static Set<String> intersectSets(Set<String> set1, Set<String> set2) {
        // Создаем множество для хранения результата
        Set<String> result = new HashSet<>();

        // Используем итератор для перебора элементов первого множества
        Iterator<String> iterator = set1.iterator();

        // Перебираем каждый элемент первого множества
        while (iterator.hasNext()) {
            // Сохраняем текущий элемент в переменной
            String element = iterator.next();

            // Проверяем, содержится ли текущий элемент во втором множестве
            if (set2.contains(element)) {
                // Если содержится, добавляем его в результирующее множество
                result.add(element);
            }
        }

        // Возвращаем результирующее множество
        return result;
    }
}

