import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Вычсисление площади и периметра прямоугольника");
//      # Задача 1
//      Запросить у пользователя два целых числа - длину и ширину прямоугольника.
//      Вычислить периметр и площадь прямоугольника.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длину прямоугольника: ");// приглашение пользователю
        String sLength = br.readLine(); // читаем строку
        int nLength = Integer.parseInt(sLength); // преобразовываем строку в целое число

        System.out.println("Введите ширину прямоугольника: ");// приглашение пользователю
        String sWidth = br.readLine(); // читаем строку
        int nWidth = Integer.parseInt(sWidth); // преобразовываем строку в целое число

        System.out.println("Площадь прямоугольника = " + (nLength * nWidth));
        System.out.println("Периметр прямоугольника = " + (nLength + nWidth) * 2);
    }
}

//      Алгоритм организации ввода данных с клавиатуры:
//        * Шаг 1. import необходимых библиотек в код программы
//        * Шаг 2. Инициализация классов и методов для чтения вводимых данных
//        * Шаг 3. Приглашение пользователю с помощью System.out.println("Введите ...");
//        * Шаг 4. Выбор типа переменной, придумывание ей имени, выбор метода чтения;
//        * Шаг 5. Использование полученных данных с помощью System.out.println("Сообщение о чем то ...").

//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));