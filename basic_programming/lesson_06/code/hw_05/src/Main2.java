//Вычислите площадь треугольника по формуле Герона: p = (a + b + с)/2; S = sqrt(p*(p-a)(p-b)(p-c));
import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Вычисление площади треугольника по формуле Герона ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите переменную - сторону треугольника а = ");// приглашение пользователю
        String sA = br.readLine();// читаем строку
        int a = Integer.parseInt(sA);// преобразовываем строку в целое число

        System.out.println("Введите переменную - сторону треугольника b = ");// приглашение пользователю
        String sB = br.readLine();// читаем строку
        int b = Integer.parseInt(sB);// преобразовываем строку в целое число

        System.out.println("Введите переменную - сторону треугольника c = ");// приглашение пользователю
        String sC = br.readLine();// читаем строку
        int c = Integer.parseInt(sC);// преобразовываем строку в целое число

        int p = (int) ((a + b + c)/2); // вычисление переменной р
        double S = Math.sqrt(p  * (p-a) * (p-b) * (p-c));// вычисление площади треугольника по формуле Герона
        System.out.println("Площадь треугольника = " + S);// выводим на экран результат
    }
}