package homework;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class BirthdayMapExample {
    public static void main(String[] args) {
        // Создаем Map, где ключ - это имя человека, а значение - его дата рождения
        Map<String, LocalDate> birthdays = new HashMap<>();

        // Метод put() используется для добавления пары ключ-значение в Map
        birthdays.put("Иван", LocalDate.of(1990, 5, 10));
        birthdays.put("Ольга", LocalDate.of(1985, 3, 20));
        birthdays.put("Елена", LocalDate.of(1995, 1, 15));
        birthdays.put("Сергей", LocalDate.of(1992, 7, 8));
        birthdays.put("Анна", LocalDate.of(1989, 8, 24));

        // Метод get() используется для получения значения по ключу
        LocalDate ivansBirthday = birthdays.get("Иван");
        System.out.println("День рождения Ивана: " + ivansBirthday);

        // Метод remove() используется для удаления пары по ключу
        birthdays.remove("Сергей");

        // Метод containsKey() проверяет наличие ключа в Map
        boolean hasIvan = birthdays.containsKey("Иван"); // вернет true
        boolean hasSergey = birthdays.containsKey("Сергей"); // вернет false, так как мы удалили Сергея
        System.out.println("В списке есть Иван? " + hasIvan);
        System.out.println("В списке есть Сергей? " + hasSergey);

        // Метод containsValue() проверяет наличие значения в Map
        boolean hasDate = birthdays.containsValue(LocalDate.of(1995, 1, 15)); // вернет true
        System.out.println("Такая дата есть в списке? " + hasDate);

        // Метод keySet() возвращает набор всех ключей
        for (String name : birthdays.keySet()) {
            System.out.println(name);
        }

        // Перебор значений в Map
        for (LocalDate date : birthdays.values()) {
            System.out.println(date);
        }
    }
}
