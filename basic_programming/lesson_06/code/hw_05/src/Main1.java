import java.io.*;
public class Main1 {
    public static void main(String[] args) throws IOException {
//      Вычислите гепотенузы
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // инициализация - включаем BR для чтения с клавиатуры

        System.out.println("Введите сторону катета 1 ");
        String num1 = br.readLine(); // читаем в переменную типа String (это последовательность символов)
        System.out.println("Сторона  треугольника (катет): " + num1); // печатаем подтверждение для пользователя

        int n1 = Integer.parseInt(num1); // преобразование String в int
        int s = n1 * n1; // возведение в квадрат

        System.out.println("Введите вторую сторону треугольника (катет)");
        String num2 = br.readLine(); // читаем в переменную типа String (это последовательность символов)
        System.out.println(" Вторая сторона треугольника: " + num2); // печатаем подтверждение для пользователя

        int n2 = Integer.parseInt(num2); // преобразование String  int s int
        int d = n2 * n2; // возводим в квадрат

        double p;
        p = Math.sqrt(s + d);

        System.out.println("гипотенуза треугольника равна: " + p); // напечатали значение
    }
}

// snake_style - так именуют переменные
// camelStyle - или еще так именуют переменные