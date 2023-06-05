import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
//        Задача 1
//        Запросить у пользователя три стороны треугольника.
//        Проверить выполнимость неравенства треугольника -
//        любая из сторон должна быть меньше суммы двух других.
//        Сообщить результат пользователю -
//        существует или нет треугольник с введенными сторонами.
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter the length of side A: ");
        double a = scanner.nextDouble();
 
        System.out.println("Enter the length of side B: ");
        double b = scanner.nextDouble();
 
        System.out.println("Enter the length of side C: ");
        double c = scanner.nextDouble();
 
        if (a + b > c && a + c > b && b + c > a) { // && - проверяется первое условие
            System.out.println("The triangle with the given sides exists.");
        } else {
            System.out.println("The triangle with the given sides does not exist.");
        }
 
    }
}