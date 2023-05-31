import java.io.*;
public class Main1 {
    public static void main(String[] args) throws IOException {
//        Вычислите гепотенузы
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // инициализация - включаем BR для чтения с клавиатуры
        System.out.println("Введите сторону катета 1 ");
        String num1 = br.readLine(); // читаем в переменную типа String (это последовательность символов)
        System.out.println("Сторона  квадрата катета: " + int s); // печатаем подтверждение для пользователя
        int n1 = Integer.parseInt(num1); // преобразование String в int
        int s = n1 * n1;
        System.out.println("Введите сторону катета 2 ");
        String num2 = br.readLine(); // читаем в переменную типа String (это последовательность символов)
        System.out.println(" квадрат катета равна: " + int d ); // печатаем подтверждение для пользователя
        int n2 = Integer.parseInt(num1); // преобразование String  int s int
        int d = n2 * n2;
        int p;
        p = s + d;
        System.out.println("гипотенуза треугольника равна: " + p); // напечатали значение
    }
}