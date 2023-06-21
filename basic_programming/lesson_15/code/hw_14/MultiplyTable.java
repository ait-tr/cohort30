package hw_14;

public class MultiplyTable {
    public static void main(String[] args) {

        int size = 10; // Размер таблицы (от 1 до size)
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                int result = i * j;
                System.out.print(result + "\t"); // Выводим результат умножения с табуляцией
            }
            System.out.println(); // Переходим на новую строку после каждого ряда
        }

        System.out.println("Таблица умножения");
        System.out.println("=================");
        int a = 2, b = 2;
        while (b < 10){
            System.out.println(a + " * " + b + " = " + a * b);
            a ++;
            if (a > 9){
                System.out.println("=================");
                a = 2;
                b++;
            }
        }
    }
}