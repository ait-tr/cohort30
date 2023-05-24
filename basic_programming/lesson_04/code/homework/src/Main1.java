import java.io.*;

public class Main1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Бот - собеседник");
//         Задача 2
//        Напишите программу — простого бота, который задаёт вам вопросы и использует ваши ответы.
//        В программе должно быть не меньше трёх вопросов.
//        Как минимум один ответ нужно считать и использовать, как число.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Привет!");// приглашение пользователю
        System.out.println("Как тебя зовут?");// приглашение пользователю
        String name = br.readLine(); // читаем строку

        System.out.println("Привет, " + name + ". Какое красивое имя!");

        System.out.println("Сколько тебе лет?");// приглашение пользователю
        String sAge = br.readLine(); // читаем строку
        int nAge = Integer.parseInt(sAge); // преобразовываем строку в целое число

        System.out.println(nAge + " - замечательный возраст!");

        System.out.println("А какая у вас в стране средняя продолжительность жизни?");// приглашение пользователю
        String s = br.readLine(); // читаем строку
        int life = Integer.parseInt(s); // преобразовываем строку в целое число

        System.out.println("Получается, что тебе примерно осталось " + (life - nAge) + " лет жизни. Не теряй время попусту!");
    }
}

//      Алгоритм организации ввода данных с клавиатуры:
//        * Шаг 1. import необходимых библиотек в код программы
//        * Шаг 2. Инициализация классов и методов для чтения вводимых данных
//        * Шаг 3. Приглашение пользователю с помощью System.out.println("Введите ...");
//        * Шаг 4. Выбор типа переменной, придумывание ей имени, выбор метода чтения;
//        * Шаг 5. Использование полученных данных с помощью System.out.println("Сообщение о чем то ...").

//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));