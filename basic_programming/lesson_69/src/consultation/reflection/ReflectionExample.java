package consultation.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Создаем объект класса MyClass
            MyClass obj = new MyClass(10);

            // Получаем объект Class для класса MyClass
            Class<?> cls = obj.getClass();
            System.out.println("Имя класса: " + cls.getName());

            // Получаем доступ к приватному полю "number"
            Field field = cls.getDeclaredField("number");
            field.setAccessible(true); // Делаем поле доступным
            System.out.println("Значение приватного поля 'number': " + field.getInt(obj));

            // Изменяем значение приватного поля "number"
            field.setInt(obj, 20);
            System.out.println("Новое значение приватного поля 'number': " + obj.getNumber());

            // Получаем доступ к приватному методу "privateMethod"
            Method method = cls.getDeclaredMethod("privateMethod");
            method.setAccessible(true); // Делаем метод доступным
            method.invoke(obj); // Вызываем метод

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



