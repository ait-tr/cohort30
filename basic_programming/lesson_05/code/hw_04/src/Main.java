import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

//        Вычислите площадь квадрата и объем куба со стороной а.
//        Значение a запросить у пользователя.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // инициализация - включаем BR для чтения с клавиатуры

        System.out.println("Введите сторону квадрата: ");
        String num1 = br.readLine(); // читаем в переменную типа String (это последовательность символов)
        System.out.println("Сторона равна: " + num1 ); // печатаем подтверждение для пользователя

        int n1 = Integer.parseInt(num1); // преобразование String в int
        int s = n1 * n1;

        System.out.println("Площадь квадрата равна: " +  n1  + " умноженное на " +  n1 ); // сообщение, возможно лишнее
        System.out.println("Площадь квадрата равна: " + s); // напечатали значение

        System.out.println("Объем куба: ");
       //  BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in)); - второй раз НЕ НАДО!
        System.out.println("Введите сторону куба: ");
        String num2 = br.readLine();
        System.out.println("Ребро куба равно: " + num2 );
        int n2 = Integer.parseInt(num2);

        // int v = n2 * n2 * n2;
        int v = (int)Math.pow(n2, 3); // тоже так можно вычислить

        System.out.println("объем куба равен: " + n2 + " умноженное на " + n2 + " и " + " умноженное на " + n2 );
        System.out.println("объем куба равен: " + v);
    }
}

//      Алгоритм организации ввода данных с клавиатуры:
//        * Шаг 1. import необходимых библиотек в код программы
//        * Шаг 2. Инициализация классов и методов для чтения вводимых данных
//        * Шаг 3. Приглашение пользователю с помощью System.out.println("Введите ...");
//        * Шаг 4. Выбор типа переменной, придумывание ей имени, выбор метода чтения;
//        * Шаг 5. Использование полученных данных с помощью System.out.println("Сообщение о чем то ...").