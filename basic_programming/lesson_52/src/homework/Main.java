package homework;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Инициализация двух множеств для демонстрации
        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        set1.add("D");

        Set<String> set2 = new HashSet<>();
        set2.add("C");
        set2.add("D");
        set2.add("E");
        set2.add("F");

        // Вызов метода и вывод результата
        Set<String> resultSet = getDifference(set1, set2);
        System.out.println("Результирующее множество: " + resultSet);
    }

    /**
     * Метод возвращает новое множество, которое содержит элементы,
     * присутствующие в первом множестве, но отсутствующие во втором.
     *
     * @param set1 Первое множество
     * @param set2 Второе множество
     * @return Новое множество, содержащее разницу между set1 и set2
     */
    public static Set<String> getDifference(Set<String> set1, Set<String> set2) {
        // Создаем новое множество для хранения результата
        Set<String> result = new HashSet<>();

        // Добавляем все элементы из первого множества в результирующее
        result.addAll(set1);

        // Удаляем из результирующего множества все элементы, которые есть во втором множестве
        // Это оставит в результирующем множестве только те элементы, которые есть в первом, но нет во втором
        result.removeAll(set2);

        return result;
    }
}

